package org.teemola.demo.dao;

import org.teemola.demo.entity.YktTeachingPlanInfo;

public interface YktTeachingPlanInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktTeachingPlanInfo record);

    int insertSelective(YktTeachingPlanInfo record);

    YktTeachingPlanInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktTeachingPlanInfo record);

    int updateByPrimaryKey(YktTeachingPlanInfo record);
}