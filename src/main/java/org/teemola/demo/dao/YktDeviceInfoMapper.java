package org.teemola.demo.dao;

import org.teemola.demo.entity.YktDeviceInfo;

public interface YktDeviceInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktDeviceInfo record);

    int insertSelective(YktDeviceInfo record);

    YktDeviceInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktDeviceInfo record);

    int updateByPrimaryKey(YktDeviceInfo record);
}