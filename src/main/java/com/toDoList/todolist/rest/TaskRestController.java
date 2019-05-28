package com.toDoList.todolist.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toDoList.todolist.entity.Task;
import com.toDoList.todolist.service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskRestController {

	private TaskService taskService;
	
	@Autowired
	public TaskRestController(TaskService theTaskService) {
		taskService = theTaskService;
	}
	
	@GetMapping("/tasks")
	public List<Task> findAll() {
		return taskService.findAll();
	}
	
	@GetMapping("/tasks/{taskId}")
	public Task getTask(@PathVariable int taskId) {
		
		Task theTask = taskService.findById(taskId);
		
		if (theTask == null) {
			throw new RuntimeException("Task id not found - " + taskId);
		}
		
		return null;
	}
	
	@PostMapping("/tasks")
	public Task addTask(@RequestBody Task theTask) {
		
		theTask.setId(0);
		
		taskService.save(theTask);
		
		return theTask;
	}
	
	@PutMapping("/tasks")
	public Task updateTask(@RequestBody Task theTask) {
		
		taskService.save(theTask);
		
		return theTask;
	}
	
	@DeleteMapping("/tasks/{taskId}")
	public String deleteTask(@PathVariable int taskId) {
		
		Task theTask = taskService.findById(taskId);
		
		if (theTask == null) {
			throw new RuntimeException("Task id not found - " + taskId);
		}
		
		taskService.deleteById(taskId);
		
		return "Deleted task with id - " + taskId;
	}
}
