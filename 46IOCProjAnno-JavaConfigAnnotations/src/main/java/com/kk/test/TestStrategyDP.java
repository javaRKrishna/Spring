package com.kk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.kk.comp.Flipkart;

public class TestStrategyDP {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		//Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		Flipkart fpkt=ctx.getBean(Flipkart.class);
		System.out.println(fpkt.shopping(new double[] {
											2500,545,465},new String[] {
											"Pen","Coat","Pencil"
		}));
		
	}
}
