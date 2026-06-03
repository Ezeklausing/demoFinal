package com.RestController.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class testController {

    @GetMapping("/ping")
    public String firstTest() {
        return "Pong";
    }

    @PostMapping("/nombre")
    public String recibirNombre(@RequestBody String nombre) {
        return "Hola," + nombre ;
    }


}
