package com.accp.action;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.PaimaiBiz;
import com.accp.pojo.Pmp;
import com.accp.pojo.User;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/Paimai")
public class PaimaiAction {
	@Autowired
	private PaimaiBiz biz;
	
	/**
	 * 登录
	 * @param username
	 * @param usermm
	 * @return
	 */
	@GetMapping("login/{username}/{usermm}")
	public Map<String, Object> queryLogin(@PathVariable String username,@PathVariable String usermm) {
		Map<String, Object> message=new HashMap<String, Object>();
		User uesr=biz.queryLogin(username, usermm);
		if (uesr!=null) {
			message.put("code", "200");
		}else {
			message.put("code", "300");
		}
		return message;
	}
	/**
	 * 注册用户
	 * @param user
	 * @return
	 */
	@PostMapping("user")
	public Map<String, String> addPersonInfo(@RequestBody User user) {
		Map<String, String> message = new HashMap<String, String>();
		biz.addUser(user);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	
	@GetMapping("{pmpname}/{pmpms}/{pmpkssj}/{pmpjssj}/{pmpqpj}/{pageNum}/{pageSize}")
	public PageInfo<Pmp> queryAll(@PathVariable String pmpname,@PathVariable String pmpms,@PathVariable String pmpkssj,
			@PathVariable String pmpjssj,@PathVariable String pmpqpj,@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return biz.queryAll(pmpname, pmpms, pmpkssj, pmpjssj, pmpqpj, pageNum, pageSize);
	}
	
}
