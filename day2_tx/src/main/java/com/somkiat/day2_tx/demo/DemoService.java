package com.somkiat.day2_tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;
    @Autowired
    private DemoGateway demoGateway;

    public void process1(){
        demoRepository.findAll();
        demoRepository.findById(1);
        demoGateway.call();
    }

}
