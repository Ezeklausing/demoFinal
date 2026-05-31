package com.RestController.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class testController {

    @GetMapping("/ping")
    public String firstTest() {
        return "Pong";
    }
}
