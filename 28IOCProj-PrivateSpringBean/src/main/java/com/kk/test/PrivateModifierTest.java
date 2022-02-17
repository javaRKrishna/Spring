package com.kk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kk.beans.TestBean;

public class PrivateModifierTest {
	public static void main(String[] args) {
		
	XmlBeanDefinitionReader  reader=null;
	DefaultListableBeanFactory factory=null;
	TestBean tb=null;
	Object obj=null;
	   //create IOC container
	factory=new DefaultListableBeanFactory();
	reader=new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
	//get Bean
	tb=factory.getBean("tb",TestBean.class);
	System.out.println(tb);
	System.out.println("--------------------------------------");
	 obj=factory.getBean("tbDemo",Object.class);
	 System.out.println(obj);
	}
}
