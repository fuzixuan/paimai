package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.PaimaiBiz;

@SpringBootTest
class PaimaiApplicationTests {
@Autowired
	private PaimaiBiz biz;
	@Test
	void contextLoads() {
		
		biz.queryLogin("a", "123");
		
	}

}
