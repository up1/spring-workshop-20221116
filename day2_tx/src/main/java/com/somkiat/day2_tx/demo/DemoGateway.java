package com.somkiat.day2_tx.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoGateway {

    public void call(){
        System.out.println("Called gateway");
    }

}
