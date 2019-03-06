package org.teemola.demo.dao;

import org.teemola.demo.entity.YktSchoolMajorInfo;

public interface YktSchoolMajorInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktSchoolMajorInfo record);

    int insertSelective(YktSchoolMajorInfo record);

    YktSchoolMajorInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktSchoolMajorInfo record);

    int updateByPrimaryKey(YktSchoolMajorInfo record);
}