package com.somkiat.day2_tx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;
    @Autowired
    private DemoGateway demoGateway;

    @Autowired
    private TransactionTemplate template;

    public void process1(){

//        template.execute(status -> {
//            demoRepository.findAll();
//            demoRepository.findById(1);
//            return "OK";
//        });
//
//        demoGateway.call();
//
//        template.execute(status -> {
//            demoRepository.findAll();
//            return "OK";
//        });
        step1();
        demoGateway.call();
    }

    @Transactional
    private void step1(){
        demoRepository.findAll();
        demoRepository.findById(1);
    }

    public void process2(String name) {
        if("somkiat".equals(name)){
            System.out.println("Hello "+ name);
        }
        System.out.println("Hello");
    }
}
