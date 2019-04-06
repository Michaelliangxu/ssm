package com.xx.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.xx.pojo.User;
import com.xx.service.UserService;

public class UserServiceImpl implements UserService{

	@Override
	public User findUser(String name, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		String[] beanDefinitionNames = context.getBeanDefinitionNames();
//		for (String string : beanDefinitionNames) {
//			System.out.println(beanDefinitionNames);
//		}
	}

}
