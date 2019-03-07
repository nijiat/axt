package org.teemola.demo.dao;

import org.teemola.demo.entity.YktQuestionTypeInfo;

public interface YktQuestionTypeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktQuestionTypeInfo record);

    int insertSelective(YktQuestionTypeInfo record);

    YktQuestionTypeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktQuestionTypeInfo record);

    int updateByPrimaryKey(YktQuestionTypeInfo record);
}