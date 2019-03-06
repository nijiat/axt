package org.teemola.demo.dao;

import org.teemola.demo.entity.YktAuthorMenuRelation;

public interface YktAuthorMenuRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktAuthorMenuRelation record);

    int insertSelective(YktAuthorMenuRelation record);

    YktAuthorMenuRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktAuthorMenuRelation record);

    int updateByPrimaryKey(YktAuthorMenuRelation record);
}