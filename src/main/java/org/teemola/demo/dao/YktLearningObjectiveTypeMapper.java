package org.teemola.demo.dao;

import org.teemola.demo.entity.YktLearningObjectiveType;

public interface YktLearningObjectiveTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktLearningObjectiveType record);

    int insertSelective(YktLearningObjectiveType record);

    YktLearningObjectiveType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktLearningObjectiveType record);

    int updateByPrimaryKey(YktLearningObjectiveType record);
}