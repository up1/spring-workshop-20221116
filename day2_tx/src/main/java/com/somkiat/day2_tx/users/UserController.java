package com.somkiat.day2_tx.users;

import com.somkiat.day2_tx.demo.DemoRepository;
import com.somkiat.day2_tx.demo.Employee;
import com.somkiat.day2_tx.demo.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private DemoRepository demoRepository;

    @GetMapping("/user/{id}")
    public UserResponse getUserById(@PathVariable int id){
        Optional<Employee> result = demoRepository.findById(id);
        if(result.isPresent()) {
            UserResponse userResponse = new UserResponse();
            userResponse.setId(id);
            userResponse.setName(result.get().getName());
            return  userResponse;
        }
        throw new BusinessException(id);
    }

}
