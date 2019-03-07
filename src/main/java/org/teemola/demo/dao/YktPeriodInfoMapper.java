package org.teemola.demo.dao;

import org.teemola.demo.entity.YktPeriodInfo;

public interface YktPeriodInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktPeriodInfo record);

    int insertSelective(YktPeriodInfo record);

    YktPeriodInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktPeriodInfo record);

    int updateByPrimaryKey(YktPeriodInfo record);
}