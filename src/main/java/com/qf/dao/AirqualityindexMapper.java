package com.qf.dao;

import com.qf.bean.Airqualityindex;

import java.util.List;
import java.util.Map;

public interface AirqualityindexMapper {

    List<Airqualityindex> selectall(Map map);

    int deleteByPrimaryKey(Integer aid);

    int insert(Airqualityindex record);

    int insertSelective(Airqualityindex record);

    Airqualityindex selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Airqualityindex record);

    int updateByPrimaryKey(Airqualityindex record);
}