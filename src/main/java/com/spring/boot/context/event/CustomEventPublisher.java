package com.spring.boot.context.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void doPublisherEvent(String message) {
		 System.out.println("Publishing custom event. ");
		 applicationEventPublisher.publishEvent(new CustomEvent(this, message));
	}
	
}
