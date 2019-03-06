package org.teemola.demo.dao;

import org.teemola.demo.entity.YktPostalInfo;

public interface YktPostalInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktPostalInfo record);

    int insertSelective(YktPostalInfo record);

    YktPostalInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktPostalInfo record);

    int updateByPrimaryKey(YktPostalInfo record);
}