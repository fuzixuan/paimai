package com.accp.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.IPaimaiDao;
import com.accp.pojo.Pmp;
import com.accp.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
	/**
	 * 查询所有+多条件
	 * @param pmpname
	 * @param pmpms
	 * @param pmpkssj
	 * @param pmpjssj
	 * @param pmpqpj
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Pmp> queryAll(String pmpname,String pmpms,String pmpkssj,
			String pmpjssj,String pmpqpj,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Pmp>(dao.queryAll(pmpname, pmpms, pmpkssj, pmpjssj, pmpqpj));
	};
}
