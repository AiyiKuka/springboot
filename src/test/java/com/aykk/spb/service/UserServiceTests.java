package com.aykk.spb.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aykk.spb.bean.User;
import com.aykk.spb.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

	@Autowired
	private UserService userService;

	@Test
	public void testGetUserbyName() {
		User user = userService.findUserByName("Hu,Yongjun");
		assertEquals("123456", user.getId());
		assertEquals("Hu,Yongjun", user.getName());
		assertEquals(31, user.getAge().intValue());
	}

}
