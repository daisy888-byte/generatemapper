package com.bjpn.crm.workbench.mapper;

import com.bjpn.crm.workbench.domain.Tran;

public interface TranMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tran record);

    int insertSelective(Tran record);

    Tran selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tran record);

    int updateByPrimaryKey(Tran record);
}