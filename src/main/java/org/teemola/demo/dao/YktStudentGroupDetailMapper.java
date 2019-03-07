package org.teemola.demo.dao;

import org.teemola.demo.entity.YktStudentGroupDetail;

public interface YktStudentGroupDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktStudentGroupDetail record);

    int insertSelective(YktStudentGroupDetail record);

    YktStudentGroupDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktStudentGroupDetail record);

    int updateByPrimaryKey(YktStudentGroupDetail record);
}