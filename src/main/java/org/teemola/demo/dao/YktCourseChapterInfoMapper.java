package org.teemola.demo.dao;

import org.teemola.demo.entity.YktCourseChapterInfo;

public interface YktCourseChapterInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktCourseChapterInfo record);

    int insertSelective(YktCourseChapterInfo record);

    YktCourseChapterInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktCourseChapterInfo record);

    int updateByPrimaryKey(YktCourseChapterInfo record);
}