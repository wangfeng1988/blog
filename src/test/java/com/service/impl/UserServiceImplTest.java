package com.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.model.User;
import com.service.IUserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/Spring.xml")
public class UserServiceImplTest {
	@Resource(name="userService")
	private IUserService userService;
	
	@Test
	public void userTest(){
		User user = new User();
		user.setName("dafaa1223232");
		user.setPassword("fagafaf111");
		try {
			userService.saveUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
