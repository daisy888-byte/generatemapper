package com.bjpn.crm.settings.mapper;

import com.bjpn.crm.settings.domain.DicType;

public interface DicTypeMapper {
    int deleteByPrimaryKey(String code);

    int insert(DicType record);

    int insertSelective(DicType record);

    DicType selectByPrimaryKey(String code);

    int updateByPrimaryKeySelective(DicType record);

    int updateByPrimaryKey(DicType record);
    //com.bjpn.crm.workbench.mapper.DicTypeMapper
}