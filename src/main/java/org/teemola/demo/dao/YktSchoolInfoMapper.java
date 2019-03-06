package org.teemola.demo.dao;

import org.teemola.demo.entity.YktSchoolInfo;

public interface YktSchoolInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktSchoolInfo record);

    int insertSelective(YktSchoolInfo record);

    YktSchoolInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktSchoolInfo record);

    int updateByPrimaryKey(YktSchoolInfo record);
}