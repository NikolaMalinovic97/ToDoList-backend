package com.toDoList.todolist.service;

import java.util.List;

import com.toDoList.todolist.entity.Task;

public interface TaskService {

	public List<Task> findAll();
	
	public Task findById(int theId);
	
	public void save(Task theTask);
	
	public void deleteById(int theId);
}
