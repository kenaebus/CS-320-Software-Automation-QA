package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact(21756333,"John Snow", "John Snow", "495842959","Name here is fake at 110 St");
		});
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact(21756333,"John Snow", "John Snow", "495842959","Name here is fake at 110 St");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact(21756333,"John Snow", "John Snow", "495842959","Name here is fake at 110 St");
		});
	}
	
	@Test
	void testContactPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact(21756333,"John Snow", "John Snow", "495842959","Name here is fake at 110 St");
		});
	}
	
	@Test
	void testContactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,() -> {
			new Contact(21756333,"John Snow", "John Snow", "495842959","Name here is fake at 110 St");
		});
	}

}
