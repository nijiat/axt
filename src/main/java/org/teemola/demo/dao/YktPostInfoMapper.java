package org.teemola.demo.dao;

import org.teemola.demo.entity.YktPostInfo;

public interface YktPostInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktPostInfo record);

    int insertSelective(YktPostInfo record);

    YktPostInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktPostInfo record);

    int updateByPrimaryKey(YktPostInfo record);
}