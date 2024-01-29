package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactServiceAddContact() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact(216333,"John", "Snow", "4958429593","190 St");
		});
	}
	
	@Test
	void testContactServiceDeleteContact() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact(216333,"John", "Snow", "4958429593","190 St");
		});
	}

}
