package com.example.demo.service;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration(locations = {"classpath:/spring/applicationContext.xml"})
public class HelloServiceTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testSayHello() {	
        HelloService helloService = context.getBean(HelloService.class);
        assertEquals("Hello from Spring Boot XML Configuration!", helloService.sayHello());
    }
}
