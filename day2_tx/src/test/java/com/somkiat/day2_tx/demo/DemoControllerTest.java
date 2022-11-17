package com.somkiat.day2_tx.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoControllerTest {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void getUser() {
        UserResponse result
                = template.getForObject("/user", UserResponse.class);
        assertEquals(1, result.getId());
        assertEquals("test name", result.getName());
    }

    @MockBean
    private DemoService demoService;

    @Test
    public void process1() {
        String result
                = template.getForObject("/process1", String.class);
        assertEquals("OK process 1", result);
    }

    @Test
    public void process2() {
        String result
                = template.getForObject("/process2/somkiat", String.class);
        assertEquals("OK process 2", result);
    }

    @Test
    public void process22() {
        String result
                = template.getForObject("/process2/other", String.class);
        assertEquals("OK process 2", result);
    }
}