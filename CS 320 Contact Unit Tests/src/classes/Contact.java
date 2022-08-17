package classes;

public class Contact 

{
private final String _contactID;
	
	private String _firstName;
	
	private String _lastName;
	
	private String _contactNumber;
	
	private String _contactAddress;

	
	
	public Contact(String contactId, String firstName, String lastName, String contactNumber, String contactAddress) 
	{ 
		if(contactId == null || contactId.length() > 10) {throw new IllegalArgumentException("Please enter a valid contact ID");}
		
		if(firstName == null || firstName.length() > 10) {throw new IllegalArgumentException("Please enter a valid first name");}
		
		if(lastName == null || lastName.length() > 10) {throw new IllegalArgumentException("Please enter a valid last name");}
		
		if(contactNumber == null || contactNumber.length() !=10) {throw new IllegalArgumentException("Please enter a valid contact number");}
		
		if(contactAddress == null || contactAddress.length() > 30) { throw new IllegalArgumentException("Please enter a valid contact address");}
	
		this._contactID = contactId;
		
		this._firstName = firstName;
		
		this._lastName = lastName;
		
		this._contactNumber = contactNumber;
		
		this._contactAddress = contactAddress; 

		
	}
	

	public String getContactId() {return _contactID;}
	
	public String getFirstName() {return _firstName;}
	
	public String getLastName() {return _lastName;}
	
	public String getContactNumber() {return _contactNumber;}
	
	public String getContactAddress() {return _contactAddress;}
	
	public void setFirstName(String fName) {this._firstName = fName;} 
	
	public void setLastName(String lName) {this._lastName = lName;}
	
	public void setContactNumber(String contactNumb) {this._contactNumber = contactNumb;}
	
	public void setContactAddress(String contactAddress) { this._contactAddress = contactAddress;}
	

	
}
	



