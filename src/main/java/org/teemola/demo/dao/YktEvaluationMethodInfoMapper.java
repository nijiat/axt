package org.teemola.demo.dao;

import org.teemola.demo.entity.YktEvaluationMethodInfo;

public interface YktEvaluationMethodInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktEvaluationMethodInfo record);

    int insertSelective(YktEvaluationMethodInfo record);

    YktEvaluationMethodInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktEvaluationMethodInfo record);

    int updateByPrimaryKey(YktEvaluationMethodInfo record);
}