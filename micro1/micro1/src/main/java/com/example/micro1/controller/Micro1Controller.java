package com.example.micro1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microService1")
public class Micro1Controller {

    @GetMapping()
    public String micro1(){
        return "Micro1";
    }
}
