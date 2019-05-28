package com.aykk.spb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aykk.spb.bean.User;
import com.aykk.spb.dao.UserDao;
import com.aykk.spb.exception.SpbException;
import com.aykk.spb.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void addUser(User user) {
		try {
			userDao.addUser(user);
		} catch (Exception e) {
			throw new SpbException(e.getMessage(), e);
		}
	}

	@Override
	public void updateUser(User user) {
		try {
			userDao.updateUser(user);
		} catch (Exception e) {
			throw new SpbException(e.getMessage(), e);
		}
	}

	@Override
	public void deleteUser(int id) {
		try {
			userDao.deleteUser(id);
		} catch (Exception e) {
			throw new SpbException(e.getMessage(), e);
		}
	}

	@Override
	public User findUserByName(String userName) {
		User userInfo;
		try {
			userInfo = userDao.findByName(userName);
		} catch (Exception e) {
			throw new SpbException(e.getMessage(), e);
		}
		return userInfo;
	}

	@Override
	public List<User> findAll() {
		List<User> userInfos;
		try {
			userInfos = userDao.findAll();
		} catch (Exception e) {
			throw new SpbException(e.getMessage(), e);
		}
		return userInfos;
	}

}
