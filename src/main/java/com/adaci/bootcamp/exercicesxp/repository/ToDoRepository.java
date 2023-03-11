package com.adaci.bootcamp.exercicesxp.repository;

import com.adaci.bootcamp.exercicesxp.models.ToDo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ToDoRepository extends ReactiveMongoRepository<ToDo, Integer> {
}
