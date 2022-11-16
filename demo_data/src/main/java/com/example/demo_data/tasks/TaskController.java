package com.example.demo_data.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/task")
    public String doSth(){
        taskService.process();
        return "OK";
    }

    @GetMapping("/task2")
    public String doSth2(){
        taskService.process2();
        return "OK";
    }

}
