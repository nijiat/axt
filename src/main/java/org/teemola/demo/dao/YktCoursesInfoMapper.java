package org.teemola.demo.dao;

import org.teemola.demo.entity.YktCoursesInfo;

public interface YktCoursesInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktCoursesInfo record);

    int insertSelective(YktCoursesInfo record);

    YktCoursesInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktCoursesInfo record);

    int updateByPrimaryKey(YktCoursesInfo record);
}