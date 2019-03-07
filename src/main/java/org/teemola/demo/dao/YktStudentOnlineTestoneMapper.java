package org.teemola.demo.dao;

import org.teemola.demo.entity.YktStudentOnlineTestone;

public interface YktStudentOnlineTestoneMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktStudentOnlineTestone record);

    int insertSelective(YktStudentOnlineTestone record);

    YktStudentOnlineTestone selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktStudentOnlineTestone record);

    int updateByPrimaryKey(YktStudentOnlineTestone record);
}