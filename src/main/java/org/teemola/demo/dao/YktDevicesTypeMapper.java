package org.teemola.demo.dao;

import org.teemola.demo.entity.YktDevicesType;

public interface YktDevicesTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(YktDevicesType record);

    int insertSelective(YktDevicesType record);

    YktDevicesType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(YktDevicesType record);

    int updateByPrimaryKey(YktDevicesType record);
}