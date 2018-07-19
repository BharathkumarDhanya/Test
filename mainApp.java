package com.example.topics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ConfigurableApplicationContext cgt=	SpringApplication.run(mainApp.class, args);
	TopicsControler ts=cgt.getBean(TopicsControler.class);
	ts.display();

	}

}
