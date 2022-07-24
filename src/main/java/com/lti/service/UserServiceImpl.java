package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.dao.UserDao;
import com.lti.dto.UserDto;
import com.lti.entity.User;

@Repository
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	public User register(User user) {
		User user2 = userDao.register(user);
		return user2;
	}

	public UserDto login(User user) {
		UserDto userDto = userDao.login(user);
		return userDto;
	}

}
