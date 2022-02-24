package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(value = "/status", produces = "text/html")
    public String status() {
        return "ok";
    }
    @GetMapping(value = "/loginov", produces = "application/json", consumes = "application/json")
    public Model aviaSales(@RequestBody Model modelka) {
        return modelka;
    }
}

