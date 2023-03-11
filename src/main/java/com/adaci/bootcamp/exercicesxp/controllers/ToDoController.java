package com.adaci.bootcamp.exercicesxp.controllers;

import com.adaci.bootcamp.exercicesxp.models.ToDo;
import com.adaci.bootcamp.exercicesxp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    @Autowired
    private ToDoRepository repository;

    @GetMapping("")
    private ResponseEntity<List<ToDo>> getAll() {
        return ResponseEntity.ok(repository.findAll().collectList().block());
    }
}
