package org.teemola.demo.dao;

import org.teemola.demo.entity.YktCourseObjectiveInfo;

public interface YktCourseObjectiveInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktCourseObjectiveInfo record);

    int insertSelective(YktCourseObjectiveInfo record);

    YktCourseObjectiveInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktCourseObjectiveInfo record);

    int updateByPrimaryKey(YktCourseObjectiveInfo record);
}