package com.zy.springevent.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.zy.springevent.event.UserRegisterEvent;

/**
 * SmartApplicationListener实现有序监听:先处理注册事件，再处理发邮件事件
 * 两个方法supportsEventType、supportsSourceType来作为区分是否是我们监听的事件，只有这两个方法同时返回true时才会执行onApplicationEvent方法
 * getOrder方法，这个方法就可以解决执行监听的顺序问题，return的数值越小证明优先级越高，执行顺序越靠前
 * @author zhongyang
 *
 */
@Component
public class RegisterUserEmailSmartListener implements SmartApplicationListener {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Async
	@Override
	public void onApplicationEvent(ApplicationEvent userRegisterEvent) {
		this.logger.info("用户注册成功,发送邮件给:{}", ((UserRegisterEvent) userRegisterEvent).getUser().getName());
	}

	/**
	 * 同步情况下监听执行的顺序
	 */
	@Override
	public int getOrder() {
		return 1;
	}

	/**
	 * 该方法返回true&supportsSourceType同样返回true时，才会调用该监听内的onApplicationEvent方法
	 */
	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
		//只有UserRegisterEvent监听类型才会执行下面逻辑
        return aClass == UserRegisterEvent.class;
	}

	/**
	 * 该方法返回true&supportsEventType同样返回true时，才会调用该监听内的onApplicationEvent方法
	 */
	@Override
	public boolean supportsSourceType(Class<?> aClass) {
        return true;
	}

}
