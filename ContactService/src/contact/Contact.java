package contact;
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
	
	public int updateCalc = 0;
	
	// Constructor
	public Contact(int id, String firstName, String lastName, String phoneNum, String address) {
		this.contactID = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
	}
		
	public int getID() {
		/**
		 * Retrieve a contact's ID
		 * @return contactID
		 */
		return contactID;
	}
	
	public void setID(int contactID) {
		/**
		 * Set an ID that aligns to requirements -- Can only be changed once.
		 * @param contactID 
		 */
		
		// Check if ID is empty and haven't been changed more than once
		if (this.contactID == 0 && updateCalc <= 1) {
			this.contactID = contactID;
			updateCalc++;

		} else {
			throw new IllegalArgumentException("ERROR: Contact ID can't be changed");
		}
		
	}
	
	public String getFirstName() {
		/**
		 * Retrieve a contact's firstName
		 * @return firstName
		 */
		
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		/**
		 * Set a firstName that aligns to requirements
		 * @param firstName 
		 */
		
		// Check if the length of the first name is less than 10 and set to contact's first name
		if (String.valueOf(firstName).length() < 10 && String.valueOf(firstName).length() > 0) {
			this.firstName = firstName;
		} else {
			// Send exception of invalid first name
			throw new IllegalArgumentException("ERROR: First name is too long or too short");
		}
		
	}
	
	public String getLastName() {
		/**
		 * Retrieve a contact's last name
		 * @return lastName
		 */
		
		return lastName;
	}
	
	public void setLastName(String lastName) {
		/**
		 * Set a last name that aligns to requirements
		 * @param lastName 
		 */
		
		// Check if the length of last name is less than 10 and set to contact's last name
		if (String.valueOf(lastName).length() < 10 && String.valueOf(lastName).length() > 0) {
			this.lastName = lastName;
		} else {
			// Send exception of invalid last name
			throw new IllegalArgumentException("ERROR: Last name is too long or too short");
		}
	}
	
	public String getPhoneNumber() {
		/**
		 * Retrieve a contact's phone number
		 * @return phoneNum
		 */
		
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
		/**
		 * Retrieve a contact's address
		 * @return address
		 */
		
		return address;
	}
	
	public void setAddress(String address) {
		/**
		 * Set an address that aligns to requirements
		 * @param address
		 */
		
		// Check if the length of address is no longer than 30 and not null
		if (String.valueOf(address).length() <= 30 && String.valueOf(address).length() > 0) {
			this.address = address;
		} else {
			// Send exception of invalid phone number
			throw new IllegalArgumentException("ERROR: Invalid address");
		}
	} 
}
