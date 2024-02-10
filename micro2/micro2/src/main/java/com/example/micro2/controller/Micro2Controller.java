package com.example.micro2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microService2")
public class Micro2Controller {

    @GetMapping()
    public String micro2(){
        return "Micro2";
    }
}
