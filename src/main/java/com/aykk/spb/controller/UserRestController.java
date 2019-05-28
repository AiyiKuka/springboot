package com.aykk.spb.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aykk.spb.bean.User;
import com.aykk.spb.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserRestController {
	private static final Logger LOGGER = Logger.getLogger(UserRestController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public void addUser(User user) {
		LOGGER.info("Start adding user.");
		userService.addUser(user);
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public void updateUser(User user) {
		LOGGER.info("Start updating user.");
		userService.updateUser(user);
	}

	@RequestMapping(value = "/user", method = RequestMethod.DELETE)
	public void delete(@RequestParam(value = "userName", required = true) int userId) {
		LOGGER.info("Start deleting user.");
		userService.deleteUser(userId);
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public User findByUserName(@RequestParam(value = "userName", required = true) String userName) {
		LOGGER.info("Start query user.");
		return userService.findUserByName(userName);
	}

	@RequestMapping(value = "/userAll", method = RequestMethod.GET)
	public List<User> findByUserAge() {
		LOGGER.info("Start query all user.");
		return userService.findAll();
	}
}
