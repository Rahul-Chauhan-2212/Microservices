package com.contacts.contactservice.controller;

import java.util.List;

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

	@Autowired
	private ContactService contactService;

	@GetMapping("/{id}")
	public List<Contact> getContactsOfUser(@PathVariable("id") Long userId) {
		return contactService.getContactsOfUser(userId);
	}

}
