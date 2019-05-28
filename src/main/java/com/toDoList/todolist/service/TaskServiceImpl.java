package com.toDoList.todolist.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.toDoList.todolist.entity.Task;

public class TaskServiceImpl implements TaskService {

	@Override
	@Transactional
	public List<Task> findAll() {
		return null;
	}

	@Override
	@Transactional
	public Task findById(int theId) {
		return null;
	}

	@Override
	@Transactional
	public void save(Task theTask) {
		
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		
	}

}
