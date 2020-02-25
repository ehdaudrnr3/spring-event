package com.spring.boot.context.event;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventConfig {

	@Bean
	public EmailPublisher emailPublisher() {
		EmailPublisher emailPublisher = new EmailPublisher();
		
		List<String> blackList = Arrays.asList("test@test.com", "ehaudrnr@gmail.com", "abc@daum.net");
		emailPublisher.setBlackList(blackList);
		return emailPublisher;
	}
	
	@Bean
	public BlackListNotifier blackListNotifier() {
		BlackListNotifier blackListNotifier = new BlackListNotifier();
		blackListNotifier.setNotificationAddress("admin@gmail.com");
		return blackListNotifier;
	}
}
