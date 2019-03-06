package org.teemola.demo.dao;

import org.teemola.demo.entity.YktMajorInfoSchool;

public interface YktMajorInfoSchoolMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktMajorInfoSchool record);

    int insertSelective(YktMajorInfoSchool record);

    YktMajorInfoSchool selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktMajorInfoSchool record);

    int updateByPrimaryKey(YktMajorInfoSchool record);
}