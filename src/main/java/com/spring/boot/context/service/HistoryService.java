package com.spring.boot.context.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.spring.boot.context.domain.History;
import com.spring.boot.context.repository.HistoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HistoryService {
	
	private final HistoryRepository historyRepository;
	
	public void insert(LocalDateTime insertDate, String username) {
		historyRepository.save(new History(insertDate, username));
	}

}
