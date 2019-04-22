package com.xy.dtboot.dao;

import com.xy.dtboot.pojo.TUser;
import java.util.List;

public interface TUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(TUser record);

    TUser selectByPrimaryKey(Integer userId);

    List<TUser> selectAll();

    int updateByPrimaryKey(TUser record);
}