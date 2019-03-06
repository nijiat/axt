package org.teemola.demo.dao;

import org.teemola.demo.entity.YktDepartementInfo;

public interface YktDepartementInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktDepartementInfo record);

    int insertSelective(YktDepartementInfo record);

    YktDepartementInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktDepartementInfo record);

    int updateByPrimaryKey(YktDepartementInfo record);
}