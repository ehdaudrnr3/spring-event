package com.spring.boot.context.event;

import java.util.List;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailPublisher implements ApplicationEventPublisherAware {

	private List<String> blackList;
	private ApplicationEventPublisher applicationEventPublisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void send(String address, String content) {
		if(blackList.contains(address)) {
			applicationEventPublisher.publishEvent(new BlackListEvent(this, address, content));
			log.info("BlackList Publisher!!");
			return;	
		}
		
		log.info("Send Mail!!");
	}

	public List<String> getBlackList() {
		return blackList;
	}

	public void setBlackList(List<String> blackList) {
		this.blackList = blackList;
	}
}
