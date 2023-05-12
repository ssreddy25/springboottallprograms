package com.ojas.mango.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.mango.model.Task;
import com.ojas.mango.repository.TaskRepository;

@Service
public class TaskServices implements TaskService {
	
	@Autowired
	private TaskRepository taskRepositray;

	@Override
	public String createTask(Task task) {
		
		Task task1=taskRepositray.save(task);
		if(task1!=null) {
			return "data inserted into a database";
		}
		
		return "data not inserted into the database";
	}

	@Override
	public void deleteTask(String id) {
		
		 taskRepositray.deleteById(id);
		 
	}

	@Override
	public String updateTask(Task task) {
		
		
		Task task1=taskRepositray.save(task);
		if(task1!=null) {
			return "data is updated into a database";
		}
		
		return "data not upadated into the database";
		
		
	}

	@Override
	public Optional<Task> getTaskbyId(String id) {
	
		Optional<Task> findById = taskRepositray.findById(id);
		
		return findById;
	}

	@Override
	public List<Task> getAllTask() {
		
		return taskRepositray.findAll();
	}

}
