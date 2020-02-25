package com.spring.boot.context.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class History {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private LocalDateTime insertDate;
	
	private String username;

	public History(LocalDateTime insertDate, String username) {
		this.insertDate = insertDate;
		this.username = username;
	}
	
}
