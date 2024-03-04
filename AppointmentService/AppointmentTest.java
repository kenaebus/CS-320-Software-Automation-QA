package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import appointment.Appointment;

class AppointmentTest {
	
	private String id, desc;
	private String longId, longDesc;
	
	private Date date, pastDate;

	@BeforeEach
	void init() throws Exception {
		id = "1234567890";
		date = new Date(3000, Calendar.DECEMBER, 2);
		desc = "This is description of appointment";
		
		longId = "1234567980524";
		pastDate = new Date(0);
		longDesc = "Extremely super long description to test for this assignment.";
	}

	@Test
	void LongIdTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->
		new Appointment(longId));
	}
	
	@Test
	void PastDateTest() {
		Appointment appointment = new Appointment();
		 assertThrows(IllegalArgumentException.class,
                 () -> appointment.setDate(pastDate));
	}
	
	@Test
	void LongDescTest() {
		Appointment appointment = new Appointment();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			appointment.setDesc(longDesc);
		});
	}
	
	@Test
	void isNullIdTest() {
		Appointment appointment = new Appointment(id);
		assertNotNull(appointment.getId());
	}
	
	@Test
	void isNullDateTest() {
		Appointment appointment = new Appointment(id, date);
		assertNotNull(appointment.getDate());
	}
	
	@Test
	void isNullDescTest() {
		Appointment appointment = new Appointment(id, date, desc);
		assertNotNull(appointment.getDesc());
	}
	
	@Test
	void SetIDTest() {
		Appointment appointment = new Appointment(id);
		appointment.checkId(id);
		Assertions.assertEquals(id, appointment.getId());
	}
	
	@Test
	void SetDateTest() {
		Appointment appointment = new Appointment(id,date);
		appointment.setDate(date);
		Assertions.assertEquals(date, appointment.getDate());
	}
	
	@Test
	void SetDescTest() {
		Appointment appointment = new Appointment(id,date,desc);
		appointment.setDesc(desc);
		Assertions.assertEquals(desc, appointment.getDesc());
	}
	
	@Test 
	void GetIDTest() {
		Appointment appointment = new Appointment(id);
		Assertions.assertEquals(id, appointment.getId());
	}
	
	void GetDateTest() {
		Appointment appointment = new Appointment(id,date);
		Assertions.assertEquals(date,appointment.getDate());
	}
	
	void GetDescTest() {
		Appointment appointment = new Appointment(id,date,desc);
		Assertions.assertEquals(desc, appointment.getDesc());
	}
}
