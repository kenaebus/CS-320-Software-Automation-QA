package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tasks.TaskService;

class TaskServiceTest {
	
	private String name, desc;
	private String longName, longDesc;

	@BeforeEach
	void init() {
		name = "Do this";
		desc = "This is description of task";
		
		longName = "Super long name to test";
		longDesc = "Extremely super long description to test for this assignment.";
	}
	

	@Test
	void addTaskTest() {
		TaskService taskService = new TaskService();
		taskService.addTask();
		Assertions.assertNotNull(taskService.getTaskList().get(0).getId());
		Assertions.assertNotEquals(null,taskService.getTaskList().get(0).getId());
		
	}
	
	@Test
	void deleteTaskTest()throws Exception {
		TaskService taskService = new TaskService();
		taskService.addTask();
		taskService.deleteTask(taskService.getTaskList().get(0).getId());
	}
	
	@Test
	void NameTaskNullTest() {
		TaskService taskService = new TaskService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> taskService.addTask(null));
	}
	
	@Test
	void DescTaskNullTest() {
		TaskService taskService = new TaskService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> taskService.addTask(name,null));
	}
	
	
	@Test
	void updateDescTest() throws Exception{
		TaskService taskService = new TaskService();
		taskService.addTask();
		taskService.updateDesc(taskService.getTaskList().get(0).getId(),desc);
		Assertions.assertEquals(desc,taskService.getTaskList().get(0).getDesc());
	}
	
	@Test
	void updateNameTest() throws Exception {
		TaskService taskService = new TaskService();
		taskService.addTask();
		taskService.updateName(taskService.getTaskList().get(0).getId(),name);
		Assertions.assertEquals(name,taskService.getTaskList().get(0).getName());
	}
	
	@Test
	void TooLongNameTest() {
		TaskService taskService = new TaskService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> taskService.addTask(longName));
	}
	
	@Test
	void TooLongDescTest() {
		TaskService taskService = new TaskService();
		Assertions.assertThrows(IllegalArgumentException.class, () -> taskService.addTask(longDesc));
	}
}
