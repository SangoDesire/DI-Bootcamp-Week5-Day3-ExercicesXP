package com.adaci.bootcamp.exercicesxp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercice1 {

    @GetMapping("/hello")
    public String helloWord(){
        return "Hello World";
    }
}
