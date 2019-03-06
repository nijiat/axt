package org.teemola.demo.dao;

import org.teemola.demo.entity.YktNationalityInfo;

public interface YktNationalityInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktNationalityInfo record);

    int insertSelective(YktNationalityInfo record);

    YktNationalityInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktNationalityInfo record);

    int updateByPrimaryKey(YktNationalityInfo record);
}