package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Pmp;
import com.accp.pojo.User;


public interface IPaimaiDao{
	//登录
    User queryLogin(@Param("username") String username,@Param("usermm") String usermm);
    //注册
    int addUser(User user);
    //首页查询
    public List<Pmp> queryAll(@Param("pmpname")String pmpname, @Param("pmpms") String pmpms,
			@Param("pmpkssj") String pmpkssj,@Param("pmpjssj") String pmpjssj,@Param("pmpqpj") String pmpqpj);
}
