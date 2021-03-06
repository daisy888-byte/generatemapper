package com.bjpn.crm.workbench.mapper;

import com.bjpn.crm.workbench.domain.Clue;

public interface ClueMapper {
    int deleteByPrimaryKey(String id);

    int insert(Clue record);

    int insertSelective(Clue record);

    Clue selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Clue record);

    int updateByPrimaryKey(Clue record);
}