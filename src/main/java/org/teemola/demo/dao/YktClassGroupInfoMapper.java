package org.teemola.demo.dao;

import org.teemola.demo.entity.YktClassGroupInfo;

public interface YktClassGroupInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktClassGroupInfo record);

    int insertSelective(YktClassGroupInfo record);

    YktClassGroupInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktClassGroupInfo record);

    int updateByPrimaryKey(YktClassGroupInfo record);
}