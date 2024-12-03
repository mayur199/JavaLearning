package com.mayur.contactmanagementsystem;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactManager cm = new ContactManager();

		Contact c1 = new Contact();
		c1.setName("Mayur");
		c1.setPhoneNumber("8887948555");
		c1.setEmail("abc@gmail.com");
		Contact c2 = new Contact();
		c2.setName("Jan");
		c2.setPhoneNumber("9997777566");
		c2.setEmail("qwv@gmail.com");
		Contact c3 = new Contact();
		c3.setName("joy");
		c3.setPhoneNumber("9995787854");
		c3.setEmail("xyz@gmail.com");

		cm.addContact(c1);
        cm.addContact(c2);
        cm.addContact(c3);
        
		System.out.println("\nAll Contacts:");
		cm.viewContacts();

		System.out.println("\nRemoving joy:");
		cm.removeContact("joy");

		System.out.println("\nUpdated Contacts:");
		cm.viewContacts();

	}

}
