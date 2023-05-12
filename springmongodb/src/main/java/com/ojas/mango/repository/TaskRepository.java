package com.ojas.mango.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ojas.mango.model.Task;


public interface TaskRepository extends MongoRepository<Task, String>{

}
