package com.somkiat.day2_tx.users;

import com.somkiat.day2_tx.demo.DemoRepository;
import com.somkiat.day2_tx.demo.Employee;
import com.somkiat.day2_tx.demo.UserResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate template;

    @Autowired
    private DemoRepository demoRepository;

    @Test
    public void success_getUserById() {
        // Initial data
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("demo name");
        demoRepository.save(employee);

        UserResponse result
                = template.getForObject("/user/1", UserResponse.class);
        assertEquals(1, result.getId());
        assertEquals("demo name", result.getName());
    }

    @Test
    public void fail_user_not_found_getUserById() {
        Error result
                = template.getForObject("/user/2", Error.class);
        assertEquals(2, result.getCode());
        assertEquals("User id=2 not found", result.getMessage());
    }
}