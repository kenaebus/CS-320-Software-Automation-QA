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
	
	public ContactService() {00
		
		public boolean addContact(Contact c) {
			boolean isInContactList = false;
			
			for (Contact x: ContactList) {
				if (x.equals(c)) {
					isInContactList = true;
				}
			}0
			if (!isInContactList) {
				ContactList.add(c);
	
			} else {
				return false;
			}
		
		public boolean deleteContact(Contact c) {
			
		}
	}

}
