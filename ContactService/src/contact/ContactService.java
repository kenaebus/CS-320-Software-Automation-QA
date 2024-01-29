package contact;
import java.util.ArrayList;

public class ContactService {
	
	/**
	 * The contact service shall be able to add contacts with a unique ID.
	 * The contact service shall be able to delete contacts per contact ID.
	 * The contact service shall be able to update contact fields per contact ID. The following fields are updatable:
	 * 		-firstName
	 * 		-lastName
	 * 		-Number
	 * 		-Address
	 */
	
	// Initializers
	ArrayList<Object> ContactList = new ArrayList<>;
	boolean isInContactList;
	
	public ContactService() {
		
		/**
		 *  Add contact credentials into the list of contacts of the ArrayList ContactList
		 *  Add contact to list if successful, otherwise, return false
		 *  
		 *  @return isInContactList
		 */
		
		public boolean addContact(Contact c) {
			isInContactList = false;
			
			// Check if contact exists in the list
			for (Contact x: ContactList) {
				if (x.equals(c)) {
					isInContactList = true;
				}
			}
			
			// Add Contact to the list if it doesn't exist
			if (!isInContactList) {
				ContactList.add(c);
	
			} else {
				return false;
			}
		
		/**
		 *  Delete a contact's credentials from the list of contacts of the ArrayList ContactList
		 *  Remove contact credentials if successfull, otherwise return false
		 *  
		 *  @return isInContactList
		 */
			
		public boolean deleteContact(Contact c) {
			isInContactList = false;
			
			// Check if contact exists in the list
			for (Contact x: ContactList) {
				if (x.equals(c)) {
					isInContactList = true;
				}
			}
			
			// Remove Contact from list if it exists
			if(isInContactList) {
				ContactList.remove(c);
			} else {
				return false;
			}
		}
	}

}
