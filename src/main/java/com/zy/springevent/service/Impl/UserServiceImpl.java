package com.zy.springevent.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.zy.springevent.event.UserRegisterEvent;
import com.zy.springevent.model.User;
import com.zy.springevent.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public void userRegister(User user) {
		//发布UserRegisterEvent事件
		UserRegisterEvent userRegisterEvent = new UserRegisterEvent(this);
		userRegisterEvent.setUser(user);
		applicationContext.publishEvent(userRegisterEvent);
	}

}
