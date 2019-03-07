package org.teemola.demo.dao;

import org.teemola.demo.entity.YktScoreGet;

public interface YktScoreGetMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktScoreGet record);

    int insertSelective(YktScoreGet record);

    YktScoreGet selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktScoreGet record);

    int updateByPrimaryKey(YktScoreGet record);
}