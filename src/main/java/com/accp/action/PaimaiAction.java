package com.accp.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.PaimaiBiz;
import com.accp.pojo.User;

@RestController
@RequestMapping("/api/Paimai")
public class PaimaiAction {
	@Autowired
	private PaimaiBiz biz;
	
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
	
}
