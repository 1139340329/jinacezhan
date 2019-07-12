package com.qf.service.impl;

import com.qf.bean.District;
import com.qf.dao.DistrictMapper;
import com.qf.service.DisService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class DisServiceImpl implements DisService {


    @Resource
    private DistrictMapper districtMapper;


    @Override
    public List<District> selectAll() {
        return districtMapper.selectall();
    }

}
