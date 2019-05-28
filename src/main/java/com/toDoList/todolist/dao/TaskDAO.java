package com.toDoList.todolist.dao;

import java.util.List;

import com.toDoList.todolist.entity.Task;

public interface TaskDAO {

	public List<Task> findAll();
	
	public Task findById(int theId);
	
	public void save(Task theTask);
	
	public void deleteById(int theId);
}
