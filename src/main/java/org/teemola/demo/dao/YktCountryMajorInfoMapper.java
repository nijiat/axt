package org.teemola.demo.dao;

import org.teemola.demo.entity.YktCountryMajorInfo;

public interface YktCountryMajorInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktCountryMajorInfo record);

    int insertSelective(YktCountryMajorInfo record);

    YktCountryMajorInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktCountryMajorInfo record);

    int updateByPrimaryKey(YktCountryMajorInfo record);
}