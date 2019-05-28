package com.toDoList.todolist.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toDoList.todolist.entity.Task;

@RestController
@RequestMapping("/api")
public class TaskRestController {

	@GetMapping("/tasks")
	public List<Task> findAll() {
		return null;
	}
	
	@GetMapping("/tasks/{taskId}")
	public Task getTask(@PathVariable int taskId) {
		return null;
	}
	
	@PostMapping("/tasks")
	public Task addTask(@RequestBody Task theTask) {
		return null;
	}
	
	@PutMapping("/tasks")
	public Task updateTask(@RequestBody Task theTask) {
		return null;
	}
	
	@DeleteMapping("/tasks/{taskId}")
	public String deleteTask(@PathVariable int taskId) {
		return null;
	}
}
