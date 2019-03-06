package org.teemola.demo.dao;

import org.teemola.demo.entity.YktSinglePersQuestionRelation;

public interface YktSinglePersQuestionRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktSinglePersQuestionRelation record);

    int insertSelective(YktSinglePersQuestionRelation record);

    YktSinglePersQuestionRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktSinglePersQuestionRelation record);

    int updateByPrimaryKey(YktSinglePersQuestionRelation record);
}