package com.contacts.contactservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contacts.contactservice.entity.Contact;
import com.contacts.contactservice.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactsController {

	private static final Logger logger = LoggerFactory.getLogger(ContactsController.class);

	@Autowired
	private ContactService contactService;

	@GetMapping("/{id}")
	public List<Contact> getContactsOfUser(@PathVariable("id") Long userId) {
		logger.info("Inside Contacts Controller with user id --> {}", userId);
		return contactService.getContactsOfUser(userId);
	}

}
