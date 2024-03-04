package tasks;
import java.lang.String;

public class Task {
	
	//Initializers
	private String id;
	private String name;
	private String desc;
	
	public Task() {
		
	}
	
	public Task(String id, String name, String desc) {
		checkId(id);
		setName(name);
		setDesc(desc);
		
	}
	
	public Task(String id) {
		checkId(id);
	}
	
	public Task(String id, String name) {
		checkId(id);
		setName(name);
	}
	
	public void checkId(String id) {
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("ERROR: Task ID invalid - Null or longer than 10 characters");
		} else {
			this.id = id;
		}
	}
	

	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	
	public void setName(String name) {
		if(name == null || name.length() > 20) {
			throw new IllegalArgumentException("ERROR: Task name invalid - Null or longer than 20 characters");
		} else {
			this.name = name;
		}
		
	}
	
	public void setDesc(String desc) {
		if(desc == null || desc.length() > 50 ) {
			throw new IllegalArgumentException("ERROR: Task Description invalid - Null or longer than 50 characters");
		} else {
			this.desc = desc;
		}
		
	}
	
		
	
}
