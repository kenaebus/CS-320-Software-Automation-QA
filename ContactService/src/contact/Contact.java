0package contact;
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
		// FIXME: contactID can be set but can not be changed after initial set
		
		// Check if ID is empty
		if (this.contactID == 0 && this.contactID != 0) {
			this.contactID = contactID;
		} else {
			throw new IllegalArgumentException("ERROR: Contact ID can't be changed");
		}
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		/**
		 * Set a firstName that aligns to requirements
		 * @param firstName 
		 */
		
		// Check if the length of the first name is equal to 10 and set to contact's first name
		if (String.valueOf(firstName).length() < 10 && String.valueOf(firstName).length() > 0) {
			this.firstName = firstName;
		} else {
			// Send exception of invalid first name
			throw new IllegalArgumentException("ERROR: First name is too long or too short");
		}
		
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		/**
		 * Set a last name that aligns to requirements
		 * @param lastName 
		 */
		
		// Check if the length of last name is equal to 10 and set to contact's last name
		if (String.valueOf(lastName).length() < 10 && String.valueOf(lastName).length() > 0) {
			this.lastName = lastName;
		} else {
			// Send exception of invalid last name
			throw new IllegalArgumentException("ERROR: Last name is too long or too short");
		}
	}
	
	public String getPhoneNumber() {
		return phoneNum;
	}
	
	public void setPhoneNumber(String phoneNum) {
		/**
		 * Set a phone number that aligns to requirements
		 * @param phoneNum 
		 */
		
		// Check if the length of the phone number is equal to 10 and set to contact's phone number
		if (String.valueOf(phoneNum).length() == 10) {
			this.phoneNum = phoneNum;
		} else {
			// Send exception of invalid phone number
			throw new IllegalArgumentException("ERROR: Invalid phone number");
		}
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
