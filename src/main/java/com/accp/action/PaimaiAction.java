package com.accp.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.PaimaiBiz;

@RestController
@RequestMapping("api/Paimai")
public class PaimaiAction {
	@Autowired
	private PaimaiBiz biz;
	
}
