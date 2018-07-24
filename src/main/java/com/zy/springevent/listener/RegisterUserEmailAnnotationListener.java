//package com.zy.springevent.listener;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//import com.zy.springevent.event.UserRegisterEvent;
//
///**
// * 创建多个监听同时监听UserRegisterEvent事件
// * @author zhongyang
// *
// */
//@Component
//public class RegisterUserEmailAnnotationListener {
//	
//	private final Logger logger = LoggerFactory.getLogger(getClass());
//	
//	@EventListener
//    public void sendMail(UserRegisterEvent userRegisterEvent){
//		this.logger.info("用户注册成功,发送邮件给:{}", userRegisterEvent.getUser().getName());
//	}
//
//}
