package com.contacts.contactservice.service;

import java.util.List;

import com.contacts.contactservice.entity.Contact;

public interface ContactService {

	List<Contact> getContactsOfUser(Long userId);
}
