package com.users.userservice.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.users.userservice.entity.User;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	// fake User List
	List<User> listOfUsers = List.of(new User(1234L, "Rahul Chauhan", "63893839"),
			new User(4316L, "Nikhil Gupta", "26389349"), new User(2543L, "Prateek Sharma", "1638389"));

	@Override
	public User getUser(Long userId) {
		logger.info("Inside User Service with user id --> {}", userId);
		return listOfUsers.stream().filter(u -> u.getUserId().equals(userId)).findFirst().orElse(null);
	}

}
