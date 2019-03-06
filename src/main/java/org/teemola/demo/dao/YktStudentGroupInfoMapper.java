package org.teemola.demo.dao;

import org.teemola.demo.entity.YktStudentGroupInfo;

public interface YktStudentGroupInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktStudentGroupInfo record);

    int insertSelective(YktStudentGroupInfo record);

    YktStudentGroupInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktStudentGroupInfo record);

    int updateByPrimaryKey(YktStudentGroupInfo record);
}