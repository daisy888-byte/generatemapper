package com.bjpn.crm.workbench.mapper;

import com.bjpn.crm.workbench.domain.TranRemark;

public interface TranRemarkMapper {
    int deleteByPrimaryKey(String id);

    int insert(TranRemark record);

    int insertSelective(TranRemark record);

    TranRemark selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TranRemark record);

    int updateByPrimaryKey(TranRemark record);
}