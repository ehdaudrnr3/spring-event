package com.spring.boot.context.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BlackListHistory {
	
	@Id @GeneratedValue
	private Long id;
	
	private String address;
	
	private String content;

	public BlackListHistory(String address, String content) {
		this.address = address;
		this.content = content;
	}
}
