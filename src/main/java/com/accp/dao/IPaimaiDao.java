package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.User;


public interface IPaimaiDao{
	//登录
    User queryLogin(@Param("username") String username,@Param("usermm") String usermm);
    //注册
    int addUser(User user);
}
