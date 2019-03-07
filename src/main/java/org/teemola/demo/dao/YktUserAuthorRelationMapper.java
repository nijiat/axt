package org.teemola.demo.dao;

import org.teemola.demo.entity.YktUserAuthorRelation;

public interface YktUserAuthorRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktUserAuthorRelation record);

    int insertSelective(YktUserAuthorRelation record);

    YktUserAuthorRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktUserAuthorRelation record);

    int updateByPrimaryKey(YktUserAuthorRelation record);
}