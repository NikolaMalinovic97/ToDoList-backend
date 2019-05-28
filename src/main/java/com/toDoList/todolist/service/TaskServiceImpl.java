package com.toDoList.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.toDoList.todolist.dao.TaskDAO;
import com.toDoList.todolist.entity.Task;

@Service
public class TaskServiceImpl implements TaskService {

	private TaskDAO taskDAO;
	
	public TaskServiceImpl(TaskDAO theTaskDAO) {
		taskDAO = theTaskDAO;
	}
	
	@Override
	@Transactional
	public List<Task> findAll() {
		return taskDAO.findAll();
	}

	@Override
	@Transactional
	public Task findById(int theId) {
		return taskDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Task theTask) {
		taskDAO.save(theTask);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		taskDAO.deleteById(theId);
	}

}
