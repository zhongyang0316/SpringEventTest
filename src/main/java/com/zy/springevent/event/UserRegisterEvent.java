package com.zy.springevent.event;

import org.springframework.context.ApplicationEvent;

import com.zy.springevent.model.User;

@SuppressWarnings("serial")
public class UserRegisterEvent extends ApplicationEvent {
	
	private User user;

	public UserRegisterEvent(Object source) {
		super(source);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
