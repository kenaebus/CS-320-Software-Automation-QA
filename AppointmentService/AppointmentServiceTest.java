package test;

import java.util.Calendar;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import appointment.AppointmentService;

class AppointmentServiceTest {
	private String longDesc, desc;
	private Date pastDate, date;
	
	@BeforeEach
	void setUp() throws Exception {
		date = new Date(3000, Calendar.DECEMBER, 2);
		desc = "This is description of appointment";
		
		pastDate = new Date(0);
		longDesc = "Extremely super long description to test for this assignment.";

	}

	@Test
	void addAppointmentTest() {
		AppointmentService apptService = new AppointmentService();
		apptService.addAppointment();
		Assertions.assertNotNull(apptService.getAppointmentList().get(0).getId());
		Assertions.assertNotEquals(null,apptService.getAppointmentList().get(0).getId());
		
	}
	
	@Test
	void deleteAppointmentTest()throws Exception {
		AppointmentService apptService = new AppointmentService();
		apptService.addAppointment();
		apptService.deleteAppointment(apptService.getAppointmentList().get(0).getId());
	}
	
	@Test
	void DateAppointmentNullTest() {
		AppointmentService apptService = new AppointmentService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> apptService.addAppointment(null));
	}
	
	@Test
	void DescAppointmmentNullTest() {
		AppointmentService apptService = new AppointmentService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> apptService.addAppointment(null));
	}
	
	
	@Test
	void updateDescTest() throws Exception{
		AppointmentService apptService = new AppointmentService();
		apptService.addAppointment();
		apptService.updateDesc(apptService.getAppointmentList().get(0).getId(),desc);
		Assertions.assertEquals(desc,apptService.getAppointmentList().get(0).getDesc());
	}
	
	@Test
	void updateDateTest() throws Exception {
		AppointmentService apptService = new AppointmentService();
		apptService.addAppointment();
		apptService.updateDate(apptService.getAppointmentList().get(0).getId(),date);
		Assertions.assertEquals(date,apptService.getAppointmentList().get(0).getDate());
	}
	
	@Test
	void PastDateTest() {
		AppointmentService apptService = new AppointmentService();
		  assertThrows(IllegalArgumentException.class,
	                 () -> apptService.addAppointment(pastDate));
	}
	
	@Test
	void TooLongDescTest() {
		AppointmentService apptService = new AppointmentService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> apptService.addAppointment(date, longDesc));
	}
}
