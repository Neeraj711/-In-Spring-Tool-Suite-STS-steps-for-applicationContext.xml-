package com.example.demo.service;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class SpringxmlusingSpringBoot {	
	@Autowired
	HelloService hello;
	@Test
	public void HelloService() {
		 assertThat(hello).isNotNull();
		 System.out.println(hello.sayHello());

	}

}
