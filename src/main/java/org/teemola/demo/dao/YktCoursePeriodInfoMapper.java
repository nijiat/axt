package org.teemola.demo.dao;

import org.teemola.demo.entity.YktCoursePeriodInfo;

public interface YktCoursePeriodInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktCoursePeriodInfo record);

    int insertSelective(YktCoursePeriodInfo record);

    YktCoursePeriodInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktCoursePeriodInfo record);

    int updateByPrimaryKey(YktCoursePeriodInfo record);
}