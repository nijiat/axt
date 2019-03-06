package org.teemola.demo.dao;

import org.teemola.demo.entity.YktCoursePeriodDetail;

public interface YktCoursePeriodDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktCoursePeriodDetail record);

    int insertSelective(YktCoursePeriodDetail record);

    YktCoursePeriodDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktCoursePeriodDetail record);

    int updateByPrimaryKey(YktCoursePeriodDetail record);
}