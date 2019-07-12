package com.qf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.bean.Airqualityindex;
import com.qf.dao.AirqualityindexMapper;
import com.qf.service.AirService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.awt.print.Pageable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class AirServiceImpl implements AirService {
    @Resource
    private AirqualityindexMapper airqualityindexMapper;
    //展示全部信息
    @Override
    public PageInfo<Airqualityindex> selectall(int index, int size, String dis) {
        PageHelper.startPage(index,size);
        Map map = new HashMap();
        map.put("dis",dis);
        List<Airqualityindex> list = airqualityindexMapper.selectall(map);
        PageInfo pageInfo=new PageInfo(list);
        return pageInfo;
    }
    @Override
    public int insert(Airqualityindex airqualityindex) {
        return airqualityindexMapper.insertSelective(airqualityindex);
    }

    @Override
    public Airqualityindex sone(int id) {
        return airqualityindexMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Airqualityindex airqualityindex) {
        return airqualityindexMapper.updateByPrimaryKeySelective(airqualityindex);
    }

    @Override
    public int delect(int id) {
        return airqualityindexMapper.deleteByPrimaryKey(id);
    }


}
