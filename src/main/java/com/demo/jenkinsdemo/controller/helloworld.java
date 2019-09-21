package com.demo.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/helloworld/")
public class helloworld {
    @RequestMapping(value = "test1")
    public String test1(){
        return "test1";
    }
}
