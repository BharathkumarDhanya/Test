package com.example.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class TopicsControler {
	@Autowired
	@Qualifier("bh1")
	private Topics topic;

	public void display()
	{
		System.out.println(topic.getAuthor());
		System.out.println(topic.getId());
		System.out.println(topic.getName());
	
	}
}