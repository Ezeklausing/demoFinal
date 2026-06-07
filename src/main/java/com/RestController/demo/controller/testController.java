package com.RestController.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.RestController.demo.model.Sumador;

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

    @PostMapping("/sumador")
    public Integer nro1(@RequestBody Sumador numeros){

        return numeros.getNumero1()+ numeros.getNumero2();
    }


}

