package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cfg= SpringApplication.run(HelloMain.class, args);
		HelloWorldClass h=cfg.getBean(HelloWorldClass.class);
		h.display();
	}

}
