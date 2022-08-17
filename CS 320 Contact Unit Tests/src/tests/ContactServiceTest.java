package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.Contact;

import classes.ContactService;

class ContactServiceTest 
{

	@Test
	void testAddContacts() // Test that tries to add an entry with the same contact ID, will generate error since contact ID must be unique.
	{
		ContactService testService = new ContactService();
		
		Contact firstContact = new Contact("1028523324","Daniel","Westbrook","2591259028","245 Westbrook Heights");
		
		Contact secondContact = new Contact("1028922222","Lilly","Hammond","2482840186","194 Bumpkin Beach Road");
		
		Contact duplicateContact = new Contact("1028922222","Alfred","Butters","2849385938","128 buch street");
		
		testService.addContact(firstContact);
		testService.addContact(secondContact);
		Assertions.assertThrows(IllegalArgumentException.class,()->testService.addContact(duplicateContact));
		
		int tableSize = testService.returnTableSize();
		
		
	
	}
	
	@Test
	void testDeleteContacts() // Creates two contact objects. Adds one to hash table and tries to delete the object not in hash table. Throws error works correctly.
	{ 
		ContactService testService = new ContactService();
		
		Contact firstContact = new Contact("1234567891","Devon","Marshalls","1238549358","1231 Washington Road");
		
		Contact secondContact = new Contact("1234527592","Kurt","McNeil","2859252555","121 Whiplash Road");
		
		testService.addContact(secondContact);
		

		Assertions.assertThrows(IllegalArgumentException.class,()->testService.removeContact(firstContact)); 
		
	}
	
	@Test
	void testUpdateContacts() 
	{
		ContactService testService = new ContactService();
		
		Contact firstContact= new Contact("1239458392","James","Myers","2849584958","246 East Street");
		
		Contact secondContact = new Contact("1238492852","Kathy","Tipton","2455825928","1212 Mulburry Road");
		
		testService.addContact(secondContact);
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->testService.updateContact(firstContact,"Christopher","Myers","2849584958","246 East Street")); //Throws exception since first name is greater than 10 characters
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->testService.updateContact(firstContact,null,"Myers","2849584958","246 East Street")); // Throws an exception since first name is null
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->testService.updateContact(firstContact,"Chris","Lee-Thompkins","2849584958","246 East Street")); //Throws exception since last name is greater than 10 characters
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->testService.updateContact(firstContact,"Chris",null,"2849584958","246 East Street")); // Throws an exception since last name is null
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->testService.updateContact(firstContact,"Chris","Thomas","29584958","246 East Street")); //Throws exception since phone number is less than 10 characters
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->testService.updateContact(firstContact,"Chris","Thomas","2849584958656","246 East Street")); // Throws an exception since phone number is greater than 10 characters
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->testService.updateContact(firstContact,"Chris","Thomas",null,"246 East Street")); // Throws an exception since phone number is null
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->testService.updateContact(firstContact,"Chris","Thomas","2849584958","246 East Buckingham Drive PO Box 2174")); // Throws an exception since address is greater than 30 characters
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->testService.updateContact(firstContact,"Chris","Thomas","2849584958",null)); // Throws an exception since address is null
	}
		

		
	

}
