package com.kk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.kk.comp.Flipkart;

public class TestStrategyDPUsingApplicationContextContainer {
	public static void main(String[] args) throws Exception {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		Flipkart fpkt=context.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.shopping(new double[] {
											2500,545,465},new String[] {
											"Pen","Coat","Pencil"
		}));
		
	}
}
