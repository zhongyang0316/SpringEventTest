package com.zy.springevent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = {"com.zy.springevent"})
public class SpringEventApplication {
	
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = SpringApplication.run(SpringEventApplication.class, args);
		System.out.println(ctx.getId() + " started!");
	}
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringEventApplication.class);
	}

}
