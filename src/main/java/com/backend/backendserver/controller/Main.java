package com.backend.backendserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Main {
    @GetMapping(value="/main")
    public String main() {
        return "Hello Main";
    }
}
