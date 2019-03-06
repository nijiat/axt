package org.teemola.demo.dao;

import org.teemola.demo.entity.YktSinglePersExamRelation;

public interface YktSinglePersExamRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktSinglePersExamRelation record);

    int insertSelective(YktSinglePersExamRelation record);

    YktSinglePersExamRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktSinglePersExamRelation record);

    int updateByPrimaryKey(YktSinglePersExamRelation record);
}