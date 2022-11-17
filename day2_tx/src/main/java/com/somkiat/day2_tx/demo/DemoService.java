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
        throw new RuntimeException();
//        boolean flag = true;
//        for (int i = 0; i < 5; i++) {
//            if(i<3) {
//                System.out.println("Do nothing");
//            }
//        }
//
//        demoRepository.findAll();
//        demoRepository.findById(1);
//        demoGateway.call();
    }

    public void process2(String name) {
        if("somkiat".equals(name)){
            System.out.println("Hello "+ name);
        }
        System.out.println("Hello");
    }
}
