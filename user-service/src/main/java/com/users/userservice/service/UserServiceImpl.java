package com.users.userservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.users.userservice.entity.User;

@Service
public class UserServiceImpl implements UserService {

	// fake User List
	List<User> listOfUsers = List.of(new User(1234L, "Rahul Chauhan", "63893839"),
			new User(4316L, "Nikhil Gupta", "26389349"), new User(2543L, "Prateek Sharma", "1638389"));

	@Override
	public User getUser(Long userId) {
		return listOfUsers.stream().filter(u -> u.getUserId().equals(userId)).findFirst().orElse(null);
	}

}
