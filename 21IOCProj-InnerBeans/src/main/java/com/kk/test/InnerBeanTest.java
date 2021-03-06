package com.kk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kk.beans.CricketBat;
import com.kk.beans.ProffesionalCrickter;



public class InnerBeanTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		ProffesionalCrickter  crickter1=null,crickter2=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
		//get beans
		crickter1=factory.getBean("kohli",ProffesionalCrickter.class);
		System.out.println(crickter1.batting());
		System.out.println("-----------------------------------------------------");
		crickter2=factory.getBean("dhoni",ProffesionalCrickter.class);
		System.out.println(crickter2.batting());
		
	
		
	
	}
}
