package appointment;
import java.lang.String;
import java.util.Date;



public class Appointment {
	
	//Initializers
	private String id;
	private Date date;
	private String desc;

	public Appointment() {
		Date today = new Date();
	}
	
	public Appointment(String id) {
		Date today = new Date();
		checkId(id);
		
	}
	
	public Appointment(String id, Date date) {
		Date today = new Date();
		checkId(id);
		checkDate(date);
	}
	
	public Appointment(String id, Date date, String desc) {
		Date today = new Date();
		checkId(id);
		checkDate(date);
		checkDesc(desc);
	}
	
	public String getId() {
		return id;	
	}
	
	public Date getDate() {
		return date;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDate(Date date) {
		checkDate(date);
	}
	
	public void setDesc(String desc) {
		checkDesc(desc);
	}
	
	public void checkId(String id) {
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("ERROR: Appointment ID invalid - Null or longer than 10 characters");
		} else {
			this.id = id;
		}
		
	}
	
	public void checkDate(Date date) {
		if (date == null) {
			throw new IllegalArgumentException("ERROR: Appointment Date can not be null");
		} else if (date.before(new Date())) {
			throw new IllegalArgumentException("ERROR: Appointment Date can not be in the past");
		} else {
			this.date = date;
		}
		
	}
	
	public void checkDesc(String desc) {
		if(desc == null || desc.length() > 50 ) {
			throw new IllegalArgumentException("ERROR: Appointment Description invalid - Null or longer than 50 characters");
		} else {
			this.desc = desc;
		}
	}
	
	
	
	
}
