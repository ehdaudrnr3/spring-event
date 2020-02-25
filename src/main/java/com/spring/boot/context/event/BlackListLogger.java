package com.spring.boot.context.event;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Order(value = 2)
public class BlackListLogger implements ApplicationListener<BlackListEvent>{
	
	@Override
	public void onApplicationEvent(BlackListEvent event) {
		log.info("Log Address : {}", event.getAddress());
		log.info("Log Content : {}", event.getContent());
	}
}
