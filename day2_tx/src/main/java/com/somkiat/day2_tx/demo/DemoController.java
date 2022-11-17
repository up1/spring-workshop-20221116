package com.somkiat.day2_tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/process1")
    public String process1(){
//        demoService.process1();
        return "OK process 1";
    }

}
