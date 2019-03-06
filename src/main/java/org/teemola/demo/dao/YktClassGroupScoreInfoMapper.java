package org.teemola.demo.dao;

import org.teemola.demo.entity.YktClassGroupScoreInfo;

public interface YktClassGroupScoreInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktClassGroupScoreInfo record);

    int insertSelective(YktClassGroupScoreInfo record);

    YktClassGroupScoreInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktClassGroupScoreInfo record);

    int updateByPrimaryKey(YktClassGroupScoreInfo record);
}