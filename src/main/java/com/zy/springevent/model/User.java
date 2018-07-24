package com.zy.springevent.model;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@SuppressWarnings("serial")
public class User implements Serializable {
	
	//用户名
	private String name;
	
	//密码
	private String password;

}
