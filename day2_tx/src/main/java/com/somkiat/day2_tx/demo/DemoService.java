package com.somkiat.day2_tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;
    @Autowired
    private DemoGateway demoGateway;

    @Transactional
    public void process1(){
        demoRepository.findAll();
        demoRepository.findById(1);
        demoGateway.call();
    }

}
