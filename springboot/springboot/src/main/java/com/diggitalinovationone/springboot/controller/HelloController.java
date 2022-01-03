package com.diggitalinovationone.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String HelloMessage(){
        return "Hello, I'm learning Spring-boot";
    }
}
