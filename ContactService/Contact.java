import java.lang.String;

public class Contact {
	
	/**
	 * The contact object shall have a required unique contact ID string that cannot be longer than 10 characters. The contact ID shall not be null and shall not be updatable.
	 * The contact object shall have a required firstName String field that cannot be longer than 10 characters. The firstName field shall not be null.
	 * The contact object shall have a required lastName String field that cannot be longer than 10 characters. The lastName field shall not be null.
	 * The contact object shall have a required phone String field that must be exactly 10 digits. The phone field shall not be null.
	 * The contact object shall have a required address field that must be no longer than 30 characters. The address field shall not be null.
	 */
	
	// Initializers
	public String id;
	public String firstName;
	public String lastName;
	public String phoneNum;
	public String address;
	
	public Contact() {
	
	}
	
	public Contact(String id) {
		checkId(id);
	}
	
	public Contact(String id, String firstName) {
		checkId(id);
		setFirstName(firstName);
	}
	
	public Contact(String id, String firstName, String lastName) {
		checkId(id);
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public Contact(String id, String firstName, String lastName, String phoneNum) {
		checkId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNum);
	}
	
	public Contact(String id, String firstName, String lastName, String phoneNum, String address) {
		checkId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNum);
		setAddress(address);
	}
	
	
		
	public void checkId(String id) {
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("ERROR: Contact ID invalid - Null or longer than 10 characters");
		} else {
			this.id = id;
		}
	}
	public String getID() {
		return id;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		// Check if the length of the first name is less than 10 and set to contact's first name
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("ERROR: First name invalid - Null or longer than 10 characters");
		} else {
			this.firstName = firstName;
		}
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public void setLastName(String lastName) {

		// Check if the length of last name is less than 10 and set to contact's last name
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("ERROR: Last name invalid - Null or longer than 10 characters");
		} else {
			this.lastName = lastName;
		}
	}
	
	public String getPhoneNumber() {
		
		return phoneNum;
	}
	
	public void setPhoneNumber(String phoneNum) {
		
		// Check if the length of the phone number is equal to 10 and set to contact's phone number
		if(phoneNum == null || phoneNum.length() != 10) {
			throw new IllegalArgumentException("ERROR: Phone Numer invalid - Null or not 10 numbers");
		} else {
			this.phoneNum = phoneNum;
		}
		
	}
	
	public String getAddress() {
		
		return address;
	}
	
	public void setAddress(String address) {
		
		// Check if the length of address is no longer than 30 and not null
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("ERROR: Address invalid - Null or longer than 30 characters");
		} else {
			this.address = address;
		}
	} 
}
