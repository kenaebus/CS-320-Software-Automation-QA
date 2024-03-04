import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	private String fName, lName, phoneNum, address;

	@BeforeEach
	void init() {
		fName = "Ally";
		lName= "Sue";
		phoneNum = "9083881234";
		address = "111 Address Way";
		
	}
	
	
	@Test
	void testContactServiceAddContact() {
		ContactService contactService = new ContactService();
		contactService.addContact();
		Assertions.assertNotNull(contactService.getContactList().get(0).getID());
		Assertions.assertNotEquals(null,contactService.getContactList().get(0).getID());
		
	}
	
	@Test
	void testContactServiceDeleteContact() throws Exception{
		ContactService contactService = new ContactService();
		contactService.addContact();
		contactService.deleteContact(contactService.getContactList().get(0).getID());
	}
	
	
	@Test
	void updatefirstNameTest() throws Exception {
		ContactService contactService = new ContactService();
		contactService.addContact();
		contactService.updateFirstName(contactService.getContactList().get(0).getID(),fName);
		Assertions.assertEquals(fName,contactService.getContactList().get(0).getFirstName());
	}
	
	@Test
	void updatelastNameTest() throws Exception {
		ContactService contactService = new ContactService();
		contactService.addContact();
		contactService.updateLastName(contactService.getContactList().get(0).getID(),lName);
		Assertions.assertEquals(lName,contactService.getContactList().get(0).getLastName());
	}
	
	@Test
	void updatephoneNumberTest() throws Exception {
		ContactService contactService = new ContactService();
		contactService.addContact();
		contactService.updatePhoneNumber(contactService.getContactList().get(0).getID(),phoneNum);
		Assertions.assertEquals(phoneNum,contactService.getContactList().get(0).getPhoneNumber());
	}
	
	@Test
	void updateAddressTest() throws Exception {
		ContactService contactService = new ContactService();
		contactService.addContact();
		contactService.updateAddress(contactService.getContactList().get(0).getID(),address);
		Assertions.assertEquals(address,contactService.getContactList().get(0).getAddress());
	}

}
