package org.teemola.demo.dao;

import org.teemola.demo.entity.YktGroupInfo;

public interface YktGroupInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktGroupInfo record);

    int insertSelective(YktGroupInfo record);

    YktGroupInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktGroupInfo record);

    int updateByPrimaryKey(YktGroupInfo record);
}