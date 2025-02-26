package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import com.example.demo.service.HelloService;
@SpringBootApplication
@ImportResource("classpath:/spring/applicationContext.xml")  // Load XML Configuration
public class SpringxmlApplication {
	public static void main(String[] args) {	
        ApplicationContext context = SpringApplication.run(SpringxmlApplication.class, args);
        // Get the HelloService bean
        HelloService helloService = context.getBean(HelloService.class);
        // Call the method
        System.out.println(helloService.sayHello());
	}

}
