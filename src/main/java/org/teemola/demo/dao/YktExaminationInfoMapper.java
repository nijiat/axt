package org.teemola.demo.dao;

import org.teemola.demo.entity.YktExaminationInfo;

public interface YktExaminationInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktExaminationInfo record);

    int insertSelective(YktExaminationInfo record);

    YktExaminationInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktExaminationInfo record);

    int updateByPrimaryKey(YktExaminationInfo record);
}