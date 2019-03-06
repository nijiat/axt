package org.teemola.demo.dao;

import org.teemola.demo.entity.YktCourseTestInfo;

public interface YktCourseTestInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktCourseTestInfo record);

    int insertSelective(YktCourseTestInfo record);

    YktCourseTestInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktCourseTestInfo record);

    int updateByPrimaryKey(YktCourseTestInfo record);
}