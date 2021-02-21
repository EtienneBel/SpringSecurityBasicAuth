package com.gnegreTech.SpringSecurityBasicAuth.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class AuthController {


    @GetMapping("/auth")
    public String helloWorld() {
        return "Hello World";
    }

}
