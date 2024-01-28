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
	
	ArrayList<Object> ContactList = new ArrayList<>;
	boolean isInContactList;
	
	public ContactService() {
		
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
