package com.spring.boot.context.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.context.event.CustomEventPublisher;
import com.spring.boot.context.event.EmailPublisher;
import com.spring.boot.context.service.AlarmService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class APIController {
	
	private final AlarmService alarmService;
	
	private final CustomEventPublisher publisher;
	
	private final EmailPublisher emailPublisher;
	
	@GetMapping("/api/user")
	public void getUser() {
		alarmService.alaram(LocalDateTime.now(), "지금은 12시입니다", "동명국");
	}
	
	@GetMapping("/api/v1/event")
	public void publisher() {
		publisher.doPublisherEvent("ehdaudrnr");
	}
	
	@GetMapping("api/v2/event")
	public void email() {
		emailPublisher.send("test@test.com", "Hello World");
	}
}
