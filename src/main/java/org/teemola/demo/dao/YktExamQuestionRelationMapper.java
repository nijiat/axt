package org.teemola.demo.dao;

import org.teemola.demo.entity.YktExamQuestionRelation;

public interface YktExamQuestionRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktExamQuestionRelation record);

    int insertSelective(YktExamQuestionRelation record);

    YktExamQuestionRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktExamQuestionRelation record);

    int updateByPrimaryKey(YktExamQuestionRelation record);
}