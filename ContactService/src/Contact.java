import java.lang.String;

public class Contact {
	
	// Initializers
	public int contactID;
	public String firstName;
	public String lastName;
	public String phoneNum;
	public String address;
	
	// Constructor
	public Contact() {
		
	}
		
	public int getID() {
		return contactID;
	}
	
	public void setID(int contactID) {
		this.contactID = contactID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getPhoneNumber() {
		return phoneNum;
	}
	
	public void setPhoneNumber(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
