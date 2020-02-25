package com.spring.boot.context.advice;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.spring.boot.context.service.HistoryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
@RequiredArgsConstructor
public class AlarmAdvice {

	private final HistoryService historyService;
	
	@Pointcut("@annotation(com.spring.boot.context.annotation.AlarmListener)")
	public void pointCut() {
	}
	
	@Before("pointCut()")
	public void logging(JoinPoint joinPoint) throws Throwable {
		try {
			historyService.insert((LocalDateTime)joinPoint.getArgs()[0], joinPoint.getArgs()[1].toString());
			log.info("이것은 알람입니다.");
		} catch (Exception e) {
			throw e;
		}
	}
}
