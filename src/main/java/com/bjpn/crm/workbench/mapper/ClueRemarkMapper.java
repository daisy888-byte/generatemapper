package com.bjpn.crm.workbench.mapper;

import com.bjpn.crm.workbench.domain.ClueRemark;

public interface ClueRemarkMapper {
    int deleteByPrimaryKey(String id);

    int insert(ClueRemark record);

    int insertSelective(ClueRemark record);

    ClueRemark selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ClueRemark record);

    int updateByPrimaryKey(ClueRemark record);
}