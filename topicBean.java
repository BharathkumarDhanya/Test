package com.example.topics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class topicBean {
	
	@Bean
	public TopicsControler topicCont()
	{
		
		return new TopicsControler();
	}
	@Bean("bh1")
	public Topics setTopic()
	{
		Topics ts= new Topics();
		ts.setAuthor("Bharath");
		ts.setId(100);
		ts.setName("Test");
		return ts;
	}
	
    
	
}
