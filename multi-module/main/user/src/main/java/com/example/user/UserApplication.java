package com.example.user;

import com.example.payment.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	Payment payment;

	public static void main(String[] args) {

		SpringApplication.run(UserApplication.class, args);
	}

	void test(){
		payment.setId(1);
	}

}
