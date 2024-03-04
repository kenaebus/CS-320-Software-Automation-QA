package test;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import tasks.Task;

class TaskTest {
	
	private String id, name, desc;
	private String longId, longName, longDesc;

	@BeforeEach
	void init() {
		id = "1234";
		name = "Do this";
		desc = "This is description of task";
		
		longId = "1234567980524";
		longName = "Super long name to test";
		longDesc = "Extremely super long description to test for this assignment.";
	}
	
	@Test
	void LongIdTest() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->
		new Task(longId));
	}
	
	@Test
	void LongDescTest() {
		Task task = new Task();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.setDesc(longDesc);
		});
	}
	
	@Test
	void LongNameTest() {
		Task task = new Task();
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			task.setName(longName);
		});
	}
	
	@Test
	void IdNullTest()	{
		Task task = new Task(id);
		assertNotNull(task.getId());
	}
	
	@Test
	void DescNullTest() {
		Task task = new Task(desc);
		assertNotNull(task.getDesc());
	}
	
	@Test
	void NameNullTest() {
		Task task = new Task(name);
		assertNotNull(task.getName());
	}
	
	@Test
	void GetIDTest() {
		Task task = new Task(id);
		Assertions.assertEquals(id, task.getId());
	}
	
	@Test
	void GetNameTest() {
		Task task = new Task(id,name);
		Assertions.assertEquals(name, task.getName());
	}

	@Test
	void GetDescriptionTest() {
		Task task = new Task(id,name,desc);
		Assertions.assertEquals(desc, task.getDesc());
	}
	
	@Test
	void SetNameTest() {
		Task task = new Task(id,name);
		task.setName(name);
		Assertions.assertEquals(name, task.getName());
	}
	
	@Test
	void SetDescriptionTest() {
		Task task = new Task(id,name,desc);
		task.setDesc(desc);
		Assertions.assertEquals(desc, task.getDesc());
	}
	
}
