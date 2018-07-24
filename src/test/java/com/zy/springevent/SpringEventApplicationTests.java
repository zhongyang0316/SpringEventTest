package com.zy.springevent;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zy.springevent.model.User;
import com.zy.springevent.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringEventApplicationTests {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userservice;
	
	@Test
	public void test() throws Exception{
		this.logger.info("test start....");
		User user = new User();
		user.setName("ZY");
		user.setPassword("123456");
		this.userservice.userRegister(user);
	}

}
