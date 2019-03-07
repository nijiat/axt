package org.teemola.demo.dao;

import org.teemola.demo.entity.YktTeachingPlan;

public interface YktTeachingPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktTeachingPlan record);

    int insertSelective(YktTeachingPlan record);

    YktTeachingPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktTeachingPlan record);

    int updateByPrimaryKey(YktTeachingPlan record);
}