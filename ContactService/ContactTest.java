import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

class ContactTest {
	
	private String id, fName, lName, phoneNum, address;
	private String longId, longfName, longlName, longPhoneNum, longAddress;

	@BeforeEach
	void init() {
		id = "1234";
		fName = "Ally";
		lName= "Sue";
		phoneNum = "9083881234";
		address = "111 Address Way";
		
		longId = "1234567980524";
		longfName = "Super long first name to test";
		longlName = "Super long last name to test";
		longPhoneNum = "123456907111";
		longAddress = "Extremely super long address to test for this assignment.";
	}
	
	@Test
	void LongIdTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->
		new Contact(longId));
	}
	
	@Test
	void IdNullTest()	{
		Contact contact = new Contact(id);
		assertNotNull(contact.getID());
	}
	
	@Test
	void LongFirstNameTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->
		new Contact(longfName));
	}
	
	@Test
	void FirstNameNullTest()	{
		Contact contact = new Contact(fName);
		assertNotNull(contact.getFirstName());
	}
	
	@Test
	void LongLastNameTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->
		new Contact(longlName));
	}
	
	@Test
	void LastNameNullTest()	{
		Contact contact = new Contact(lName);
		assertNotNull(contact.getLastName());
	}
	
	@Test
	void LongPhoneNumberTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->
		new Contact(longPhoneNum));
	}
	
	@Test
	void PhoneNumberNullTest()	{
		Contact contact = new Contact(phoneNum);
		assertNotNull(contact.getPhoneNumber());
	}
	
	@Test
	void LongAddressNameTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->
		new Contact(longAddress));
	}
	
	@Test
	void AddressNullTest()	{
		Contact contact = new Contact(address);
		assertNotNull(contact.getAddress());
	}
	
	@Test
	void GetIDTest() {
		Contact contact = new Contact(id);
		Assertions.assertEquals(id, contact.getID());
	}
	
	@Test
	void GetFNameTest() {
		Contact contact = new Contact(id,fName);
		Assertions.assertEquals(fName, contact.getFirstName());
	}
	
	@Test
	void GetLNameTest() {
		Contact contact = new Contact(id,fName, lName);
		Assertions.assertEquals(lName, contact.getLastName());
	}
	
	@Test
	void GetPhoneNumberTest() {
		Contact contact = new Contact(id,fName, lName, phoneNum);
		Assertions.assertEquals(phoneNum, contact.getPhoneNumber());
	}
	
	@Test
	void GetAddressTest() {
		Contact contact = new Contact(id,fName, lName, phoneNum, address);
		Assertions.assertEquals(address, contact.getAddress());
	}
	
	@Test
	void SetFirstNameTest() {
		Contact contact = new Contact(id,fName);
		contact.setFirstName(fName);
		Assertions.assertEquals(fName, contact.getFirstName());
	}
	
	@Test
	void SetLastNameTest() {
		Contact contact = new Contact(id,fName, lName);
		contact.setLastName(lName);
		Assertions.assertEquals(lName, contact.getLastName());
	}
	
	@Test
	void SetPhoneNumberTest() {
		Contact contact = new Contact(id,fName, lName, phoneNum);
		contact.setPhoneNumber(phoneNum);
		Assertions.assertEquals(phoneNum, contact.getPhoneNumber());
	}
	
	@Test
	void SetAddressTest() {
		Contact contact = new Contact(id,fName, lName, phoneNum, address);
		contact.setAddress(address);
		Assertions.assertEquals(address, contact.getAddress());
	}

}
