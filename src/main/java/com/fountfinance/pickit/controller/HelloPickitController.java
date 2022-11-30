package com.fountfinance.pickit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPickitController {

    @GetMapping("/")
    public String hello() {
        return "Hello Pickit 🎉";
    }

}
