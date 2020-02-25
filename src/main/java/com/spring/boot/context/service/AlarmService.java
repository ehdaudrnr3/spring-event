package com.spring.boot.context.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.spring.boot.context.annotation.AlarmListener;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AlarmService {

	@AlarmListener
	public void alaram(LocalDateTime alarmDate, String memo, String username) {
		log.info("Now : {}", alarmDate);
		log.info("Memo : {}", memo);
		log.info("User : {}", username);
	}
}
