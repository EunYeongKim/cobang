package com.example.cobang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class coreController {

    @GetMapping("/")
    public String index() {
        return "HELLO";
    }
}
