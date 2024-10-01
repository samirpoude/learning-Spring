package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {

    // expose "/" tht return "hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }
}
