package com.spring.boot.context.event;

import javax.transaction.Transactional;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.spring.boot.context.domain.BlackListHistory;
import com.spring.boot.context.repository.BlackListHistoryRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Component
public class BlackListHistoryListener {
	
	private final BlackListHistoryRepository repository;
	
	@EventListener
	@Async
	@Transactional
	public void insert(BlackListEvent event) {
		log.info("History address : {}", event.getAddress());
		log.info("History Address : {}", event.getContent());
		repository.save(new BlackListHistory(event.getAddress(), event.getContent()));
	}

}
