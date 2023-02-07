package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        Date a= new Date();
        return "Монастырная Елизавета Игоревна " + a.toString();

    }


}
