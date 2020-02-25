package com.spring.boot.context.event;

import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	
	private String address;
	private String content;
	
	public BlackListEvent(Object source, String address, String content) {
		super(source);
		this.address = address;
		this.content = content;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
