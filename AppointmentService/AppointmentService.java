package appointment;

import java.util.UUID;

import appointment.Appointment;

import java.util.Date;
import java.util.ArrayList;

public class AppointmentService {;
	
	private String uniqueId;
	private ArrayList<Appointment> AppointmentList = new ArrayList<>();

	private String createUniqueId() {
		uniqueId = UUID.randomUUID().toString().substring(0,10);
		return uniqueId;
	}
	
	public Appointment searchAppointment(String id) throws Exception {
		
		for (int i = 0; i < AppointmentList.size(); i++){
			if (id.equals(AppointmentList.get(i).getId())) {
				return AppointmentList.get(i);
			}
		}
		throw new Exception("ERROR");
	}

	public void addAppointment() {
		Appointment appointment = new Appointment(createUniqueId());
		AppointmentList.add(appointment);
	}
	
	public void addAppointment(Date date) {
		Appointment appointment = new Appointment(createUniqueId(),date);
		AppointmentList.add(appointment);
	}
	
	public void addAppointment(Date date, String desc) {
		Appointment appointment = new Appointment(createUniqueId(),date, desc);
		AppointmentList.add(appointment);
	}
	
	public ArrayList<Appointment> getAppointmentList() {
		return AppointmentList;
	}
	
	public void deleteAppointment(String id) throws Exception{		
		AppointmentList.remove(searchAppointment(id));
	}
	
	public void updateDate(String id, Date date)throws Exception {
		searchAppointment(id).setDate(date);	
	}
		
	public void updateDesc(String id, String desc)throws Exception {
		searchAppointment(id).setDesc(desc);	
	}
	
	
	
}
