package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.PaimaiBiz;
import com.accp.biz.PmpBiz;
import com.accp.pojo.Pmp;

@SpringBootTest
class PaimaiApplicationTests {
@Autowired
	private PaimaiBiz biz;
@Autowired
private PmpBiz pmpbiz;
	@Test
	void contextLoads() {
		//biz.queryAll(null, null, null, null, null, 1, 4);
		//pmpbiz.addpmp(new Pmp(0, "1", "2", "3", null, null, "4", "5", "6"));
		
		
	}

}
