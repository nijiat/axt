package org.teemola.demo.dao;

import org.teemola.demo.entity.YktLearningObjectiveInfo;

public interface YktLearningObjectiveInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktLearningObjectiveInfo record);

    int insertSelective(YktLearningObjectiveInfo record);

    YktLearningObjectiveInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktLearningObjectiveInfo record);

    int updateByPrimaryKey(YktLearningObjectiveInfo record);
}