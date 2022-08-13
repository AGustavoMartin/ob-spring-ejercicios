package com.gustavomartin.obspringejercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String sayHello() {
        return "Hello World";
    }
}
