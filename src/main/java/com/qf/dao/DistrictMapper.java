package com.qf.dao;

import com.qf.bean.District;

import java.util.List;

public interface DistrictMapper {

    List<District> selectall();

    int deleteByPrimaryKey(Integer did);

    int insert(District record);

    int insertSelective(District record);

    District selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(District record);

    int updateByPrimaryKey(District record);
}