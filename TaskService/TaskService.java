package tasks;

import java.util.UUID;
import java.util.ArrayList;

public class TaskService {
	
	private String uniqueId;
	private ArrayList<Task> taskList = new ArrayList<>();
	
	private String createUniqueId() {
		uniqueId = UUID.randomUUID().toString().substring(0,10);
		return uniqueId;
	}
	
	public Task searchTask(String id) throws Exception {
		
		for (int i = 0; i < taskList.size(); i++){
			if (id.equals(taskList.get(i).getId())) {
				return taskList.get(i);
			}
		}
		throw new Exception("ERROR");
	}
		
	public void addTask() {
		Task task = new Task(createUniqueId());
		taskList.add(task);
	}
	
	public void addTask(String name) {
		Task task = new Task(createUniqueId(),name);
		taskList.add(task);
	}
	
	public void addTask(String name, String desc) {
		Task task = new Task(createUniqueId(),name, desc);
		taskList.add(task);
	}
	
	public ArrayList<Task> getTaskList() {
		return taskList;
	}
	
	public void deleteTask(String id) throws Exception{		
		taskList.remove(searchTask(id));
	}
		
	public void updateDesc(String id, String desc)throws Exception {
		searchTask(id).setDesc(desc);	
	}
		
	public void updateName(String id, String name)throws Exception {
		searchTask(id).setName(name);
	}
}
		
