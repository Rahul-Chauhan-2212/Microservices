package com.contacts.contactservice.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contacts.contactservice.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	List<Contact> listOfContacts = List.of(new Contact(1L, "amit@gmail.com", "amit", 1234L),
			new Contact(2L, "arun@gmail.com", "arun", 1234L), new Contact(3L, "akash@gmail.com", "akash", 4316L),
			new Contact(4L, "anil@gmail.com", "anil", 2543L));

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		return listOfContacts.stream().filter(c -> c.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
