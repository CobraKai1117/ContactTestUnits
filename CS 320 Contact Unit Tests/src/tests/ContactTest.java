package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import classes.Contact;

class ContactTest 
{

	@Test
	void testContact() 
	{
		Contact classTest = new Contact("1234567798","Robert","Burrows","2252292142","313 blah avenue");
		assertTrue(classTest.getContactId().equals("1234567798"));
		assertTrue(classTest.getFirstName().equals("Robert"));
		assertTrue(classTest.getLastName().equals("Burrows"));
		assertTrue(classTest.getContactNumber().equals("2252292142"));
		assertTrue(classTest.getContactAddress().equals("313 blah avenue"));
	}
	
	@Test
	void testContactIdGreaterThanTenCharacters() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class,()->{new Contact("1234567812345","Lauren","Taylor","1248574395","2727 Jackson Street");});
	}
	
	@Test
	void testContactFirstNameGreaterThanTenCharacters() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class,()->{new Contact("1234567847","Peter the Pied Pipper","Herbert","1247597285","291 Brookings Avenue");});
		
	}
	
	@Test
	void testContactLastNameGreaterThanTenCharacters() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class, ()->{new Contact("1234568271","Ben","Butterworth","1234958294","2727 Downing Drive");});
	}
	
	@Test
	void testContactNumberLessThanTenCharacters() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class, ()->{new Contact("123457283","Donald","Marsh","1235","1528 Rickenbach Drive");});
	}
	
	@Test
	
	void testContactNumberGreaterThanTenCharacters() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class, ()->{new Contact("1234958012","Sarah","Jenkins","1249582058215","2728 Mockingbird Road");});
	} 
	
	@Test
	void testContactAddressGreaterThanThirtyCharacters() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class, ()->{new Contact("1238472957","Haley","McDonald","1375829572","2847 West Buckingham Court Road");});
	}
	
	@Test
	void testContactIdNull() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class, ()->{new Contact(null,"Sandra","Bullock","1239485028","2121 Westbrook Road");});
	}
	
	@Test
	void testContactFirstNameNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class, ()->{new Contact("1239482129",null,"Thompson","184920587","129 Bishop Hill Drive");});	
	}
	
	@Test
	void testContactLastNameNull() 
	{ 
		
		Assertions.assertThrows(IllegalArgumentException.class, ()->{new Contact("1239485938","Molly",null,"1924859285","1245 Beckingham Road");});
		
	}
	
	@Test
	void testContactNumberisNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class,()->{new Contact("1293847283","Daniel","Bowers",null,"1284 Beltway Drive");});
	}
	
	@Test
	void testContactAddressisNull() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class, ()->{new Contact("1234485729","Robert","Paulsen","1285728592",null);});
	}
	
	

}
