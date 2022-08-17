package classes;

import java.io.*;
import java.util.*;

public class ContactService 
{

	static Hashtable<Integer,Contact> contactContainer = new Hashtable<>();
	
	 boolean checkForHashObject(int IdToCheck) 
	 { 
		 boolean inHashTable = contactContainer.containsKey(IdToCheck);
		 
		 return inHashTable;
		 
	 }
	 
	public int returnTableSize() 
	 { 
		 return contactContainer.size();
	 }
	
	public void addContact(Contact entryToAdd) 
	{
		 int contactIDToInt = Integer.parseInt(entryToAdd.getContactId());
		 
		 boolean alreadyExists = checkForHashObject(contactIDToInt);
		 
		
		 if(alreadyExists)  // If contact is already in hash table t
		 
		 {
			 {throw new IllegalArgumentException("Cannot add since contact already exists");  }
			 
		 }
		 
		 contactContainer.put(contactIDToInt,entryToAdd); // If object with specified contact ID doesn't exist, add it to hash table.
		 
	}
	
	public void removeContact(Contact entryToRemove) // Check to see if contact is already in hash table. If it is delete it
	{ 
		int contactIDToInt = Integer.parseInt(entryToRemove.getContactId());
		
		boolean alreadyExists = checkForHashObject(contactIDToInt);
		
		if(!alreadyExists) { throw new IllegalArgumentException("Cannot remove since contact does not exist in storage");} // If contact isn't in table throw error
		
		contactContainer.remove(contactIDToInt);
		
	}
	
	public void updateContact(Contact contactToEdit, String firstName, String lastName, String phoneNumber, String address) 
	{ 
		int contactIDToInt = Integer.parseInt(contactToEdit.getContactId());
		
		boolean alreadyExists = checkForHashObject(contactIDToInt);
		
		if(!alreadyExists) {throw new IllegalArgumentException("Cannot update since contact isn't in hash table");}
		
		if(!firstName.equals(contactToEdit.getFirstName())) 
		{ 
			if(firstName == null || firstName.length() >10) {throw new IllegalArgumentException("Please enter a valid first name");} // If first name is null or greater than 10 characters throw exception, otherwise change contact first name to value
		}
		
		contactToEdit.setFirstName(firstName);
		
		if(!lastName.equals(contactToEdit.getLastName())) 
		{ 
			if(lastName == null || lastName.length() > 10) {throw new IllegalArgumentException("Please enter a valid last name");}
		}
		
		contactToEdit.setLastName(lastName);
		
		if(!phoneNumber.equals(contactToEdit.getContactNumber())) 
		{ 
			if(phoneNumber == null || phoneNumber.length() != 10) {throw new IllegalArgumentException("Please enter a valid phone number");}
		}
		
		contactToEdit.setContactNumber(phoneNumber);
		
		if(address.equals(contactToEdit.getContactAddress())) 
		{
			if(address == null || address.length() > 30) { throw new IllegalArgumentException("Please enter a valid address"); }
		}
		
		contactToEdit.setContactAddress(address);
		
		
	}
}
