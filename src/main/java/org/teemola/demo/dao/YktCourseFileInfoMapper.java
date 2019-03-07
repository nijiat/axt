package org.teemola.demo.dao;

import org.teemola.demo.entity.YktCourseFileInfo;

public interface YktCourseFileInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktCourseFileInfo record);

    int insertSelective(YktCourseFileInfo record);

    YktCourseFileInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktCourseFileInfo record);

    int updateByPrimaryKey(YktCourseFileInfo record);
}