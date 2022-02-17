package com.kk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.beans.Person;

public class RequiredAnnoTest {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		Person per= ctx.getBean("per",Person.class);
		System.out.println(per);
	}
}
