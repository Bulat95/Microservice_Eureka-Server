package com.example.eurekaserver.controller;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Data
//@RequestMapping("/api/v1")
class Controller {

    @GetMapping(path = "/hello")
    public String getPersonsCacheCount(){
        return "hello";
    }
}