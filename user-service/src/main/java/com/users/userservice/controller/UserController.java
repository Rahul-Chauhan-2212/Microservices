package com.users.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.users.userservice.entity.Contact;
import com.users.userservice.entity.User;
import com.users.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${contact.service.url}")
	private String contactServiceUrl;

	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long userId) {

		User user = userService.getUser(userId);
		List<Contact> listOfContacts = restTemplate.getForObject(contactServiceUrl+"/"+user.getUserId(), List.class);
		user.setContacts(listOfContacts);
		return user;
	}

}
