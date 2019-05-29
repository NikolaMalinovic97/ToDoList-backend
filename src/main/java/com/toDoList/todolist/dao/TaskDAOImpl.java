package com.toDoList.todolist.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toDoList.todolist.entity.Task;

@Repository
public class TaskDAOImpl implements TaskDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public TaskDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	public List<Task> findAll() {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<Task> theQuery =
				currentSession.createQuery("from Task", Task.class);
		
		List<Task> tasks = theQuery.getResultList();
		
		return tasks;
	}

	@Override
	public Task findById(int theId) {

		Session currentSession = entityManager.unwrap(Session.class);
		
		Task theTask = currentSession.get(Task.class, theId);
		
		return theTask;
	}

	@Override
	public void save(Task theTask) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(theTask);
	}

	@Override
	public void deleteById(int theId) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query theQuery = 
				currentSession.createQuery("delete from Task where id=:taskId");
		theQuery.setParameter("taskId", theId);
		
		theQuery.executeUpdate();
	}

}
