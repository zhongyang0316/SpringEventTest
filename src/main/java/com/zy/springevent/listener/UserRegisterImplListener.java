//package com.zy.springevent.listener;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.ApplicationListener;
//import org.springframework.stereotype.Component;
//
//import com.zy.springevent.event.UserRegisterEvent;
//import com.zy.springevent.model.User;
//
///**
// * 原始方式实现,实现ApplicationListener接口
// * @author zhongyang
// *
// */
//@Component
//public class UserRegisterImplListener implements ApplicationListener<UserRegisterEvent> {
//	
//	private final Logger logger = LoggerFactory.getLogger(getClass());
//
//	@Override
//	public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
//		//获取注册用户对象
//        User user = userRegisterEvent.getUser();
//        this.logger.info("注册信息，用户名:[{}],密码:[{}]", user.getName(),user.getPassword());
//	}
//
//}
