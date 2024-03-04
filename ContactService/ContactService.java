import java.util.ArrayList;
import java.util.UUID;

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
	
	private String uniqueId;
	private ArrayList<Contact> contactList = new ArrayList<>();

	private String createUniqueId() {
		uniqueId = UUID.randomUUID().toString().substring(0,10);
		return uniqueId;
	}

	public Contact searchContact(String id) throws Exception {
		
		for (int i = 0; i < contactList.size(); i++){
			if (id.equals(contactList.get(i).getID())) {
				return contactList.get(i);
			}
		}
		throw new Exception("ERROR");
	}
		
		
	public void addContact() {
		Contact contact = new Contact(createUniqueId());
		contactList.add(contact);
	}
	
	public void addContact(String firstName) {
		Contact contact = new Contact(createUniqueId(), firstName);
		contactList.add(contact);
	}
	
	public void addContact(String firstName, String lastName) {
		Contact contact = new Contact(createUniqueId(), firstName, lastName);
		contactList.add(contact);
	}
	
	public void addContact(String firstName, String lastName, String phoneNum) {
		Contact contact = new Contact(createUniqueId(), firstName, lastName, phoneNum);
		contactList.add(contact);
	}
	
	public void addContact(String firstName, String lastName, String phoneNum, String address) {
		Contact contact = new Contact(createUniqueId(), firstName, lastName, phoneNum, address);
		contactList.add(contact);
	}
		
			
	public void deleteContact(String id) throws Exception {
		contactList.remove(searchContact(id));
	}
	
	public void updateFirstName(String id, String firstName)throws Exception {
		searchContact(id).setFirstName(firstName);	
	}
	
	public void updateLastName(String id, String lastName)throws Exception {
		searchContact(id).setLastName(lastName);	
	}
	
	public void updatePhoneNumber(String id, String phoneNum)throws Exception {
		searchContact(id).setPhoneNumber(phoneNum);	
	}
	
	public void updateAddress(String id, String address)throws Exception {
		searchContact(id).setAddress(address);	
	}

	public ArrayList<Contact> getContactList() {
		return contactList;
	}
}