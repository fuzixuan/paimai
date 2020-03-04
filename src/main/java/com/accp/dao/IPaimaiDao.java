package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.User;


public interface IPaimaiDao{
    User queryLogin(@Param("username") String username,@Param("usermm") String usermm);
}
