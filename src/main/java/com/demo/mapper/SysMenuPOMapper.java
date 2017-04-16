package com.demo.mapper;

import com.demo.model.SysMenuPO;

public interface SysMenuPOMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysMenuPO record);

    int insertSelective(SysMenuPO record);

    SysMenuPO selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysMenuPO record);

    int updateByPrimaryKey(SysMenuPO record);
}