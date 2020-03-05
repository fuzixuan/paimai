package com.accp.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.IPaimaiDao;
import com.accp.pojo.User;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PaimaiBiz {
	@Autowired
	private IPaimaiDao dao;
	
	public User queryLogin(String username,String usermm) {
		return dao.queryLogin(username, usermm);
	}
	
	public int addUser(User user) {
		return dao.addUser(user);
	}
}
