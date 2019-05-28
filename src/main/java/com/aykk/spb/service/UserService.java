package com.aykk.spb.service;

import java.util.List;

import com.aykk.spb.bean.User;

public interface UserService {

	void addUser(User user);

	void updateUser(User user);

	void deleteUser(int id);

	User findUserByName(String userName);

	List<User> findAll();

}
