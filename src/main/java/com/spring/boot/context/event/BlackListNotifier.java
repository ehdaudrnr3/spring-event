package com.spring.boot.context.event;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Order(value = 1)
public class BlackListNotifier implements ApplicationListener<BlackListEvent>{
	
	private String notificationAddress;
	
	
	public String getNotificationAddress() {
		return notificationAddress;
	}


	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}


	@Override
	public void onApplicationEvent(BlackListEvent event) {
		log.info("이벤트 관리자 발생시간 : {}", event.getTimestamp());
		log.info("관리자 이메일주소 : {}", getNotificationAddress());
		log.info("응답 이메일주소 : {}", event.getAddress());
		log.info("응답 내용 : {}", event.getContent());
	}
}
