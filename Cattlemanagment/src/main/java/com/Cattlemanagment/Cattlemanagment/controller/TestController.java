package com.Cattlemanagment.Cattlemanagment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Bonjour, vous êtes authentifié(e)!";
    }
}
