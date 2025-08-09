package com.rishabh.restApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentEndPoint {
    @GetMapping("/student")
    public String endPoint(){
        return "Ok";
    }
}
