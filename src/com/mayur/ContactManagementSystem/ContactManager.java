package com.mayur.ContactManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ContactManager {

	private List<Contact> contactList = new ArrayList<>();

	public void addContact(Contact contact) {
		contactList.add(contact);
		System.out.println(contact.getName() + " has been added.");
	}

	public void viewContacts() {
		for (Contact contact : contactList) {
			System.out.println(contact);
		}
	}

	public void removeContact(String name) {

		// contactList.removeIf(c -> c.getName().equals(c));

//		for (Contact contact : contactList) {
//			if(contact.getName().equalsIgnoreCase(name)) {
//				contactList.remove(contact);
//			}
//			
//		}
////
//		contactList.removeIf(contact -> contact.getName().equalsIgnoreCase(name));
//		System.out.println(name + " has been removed.");

		// contactList.remove()
//		for(int i=0;i<contactList.size(); i++) {
//			System.out.println(contactList.get(i));
//			if(contactList.get(i).getName().equals(name)) {
//				contactList.remove(i);
//			}
//		}

		contactList = contactList.stream().filter(c -> !c.getName().equalsIgnoreCase(name))
				.collect(Collectors.toList());
	}
}
