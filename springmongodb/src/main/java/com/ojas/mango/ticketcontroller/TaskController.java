package com.ojas.mango.ticketcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.mango.model.Task;
import com.ojas.mango.services.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;
   
	@PostMapping("/create")
	public String createTask(@RequestBody Task task) {
		
		
		return taskService.createTask(task);

	}
    @DeleteMapping("/delete/{id}")
	public void deleteTask(@PathVariable String id) {
		
		taskService.deleteTask(id);

	}
    @PutMapping("/update")
	public String updateTask(@RequestBody Task task) {
		
		return taskService.updateTask(task);

	}
	 @GetMapping("/id/{id}")
	public Optional<Task> getTaskbyId(@PathVariable String  id) {
		
		return taskService.getTaskbyId(id);

	}
   @GetMapping("/all")
	public List<Task> getAllTask() {
		
		return taskService.getAllTask();

	}

}
