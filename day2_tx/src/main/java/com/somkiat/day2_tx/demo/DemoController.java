package com.somkiat.day2_tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/user")
    public UserResponse getUser() {
        return new UserResponse(1, "test name");
    }

    @GetMapping("/process1")
    public String process1() {
        demoService.process1();
        return "OK process 1";
    }

    @GetMapping("/process2/{name}")
    public String process2(@PathVariable String name) {
        demoService.process2(name);
        return "OK process 2";
    }

}
