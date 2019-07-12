package com.qf.service;

import com.github.pagehelper.PageInfo;
import com.qf.bean.Airqualityindex;

import java.util.List;

public interface AirService {


    //展示全部信息
    public PageInfo<Airqualityindex> selectall(int index, int size, String dis);


    //保存
    public int insert(Airqualityindex airqualityindex);

    //to 更新
    public Airqualityindex sone(int id);

    //更新
    public int update(Airqualityindex airqualityindex);

    //删除
    public int delect(int id);


}
