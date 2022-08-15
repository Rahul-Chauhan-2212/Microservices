package com.contacts.contactservice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.contacts.contactservice.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	private static final Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);
	
	List<Contact> listOfContacts = List.of(new Contact(1L, "amit@gmail.com", "amit", 1234L),
			new Contact(2L, "arun@gmail.com", "arun", 1234L), new Contact(3L, "akash@gmail.com", "akash", 4316L),
			new Contact(4L, "anil@gmail.com", "anil", 2543L));

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		logger.info("Inside Contact Service with Id--> {}",userId);
		return listOfContacts.stream().filter(c -> c.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
