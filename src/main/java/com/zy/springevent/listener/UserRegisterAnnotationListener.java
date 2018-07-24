package com.zy.springevent.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.zy.springevent.event.UserRegisterEvent;
import com.zy.springevent.model.User;

/**
 * 使用@EventListener方法实现注册事件监听
 * @author zhongyang
 *
 */
@Component
public class UserRegisterAnnotationListener {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
	@EventListener
	public void userRegister(UserRegisterEvent userRegisterEvent){
		//获取注册用户对象
        User user = userRegisterEvent.getUser();
        this.logger.info("@EventListener注册信息，用户名:[{}],密码:[{}]", user.getName(),user.getPassword());
	}

}
