package org.teemola.demo.dao;

import org.teemola.demo.entity.YktEvaluationMethodType;

public interface YktEvaluationMethodTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktEvaluationMethodType record);

    int insertSelective(YktEvaluationMethodType record);

    YktEvaluationMethodType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktEvaluationMethodType record);

    int updateByPrimaryKey(YktEvaluationMethodType record);
}