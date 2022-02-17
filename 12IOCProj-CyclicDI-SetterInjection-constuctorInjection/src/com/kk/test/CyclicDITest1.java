package com.kk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kk.beans.A;
import com.kk.beans.B;



public class CyclicDITest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		A  a1=null;
		B b1=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		//create Reader
		reader=new XmlBeanDefinitionReader(factory);
		// load xml file definitations..
		reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
		//get Bean
		
		  a1=factory.getBean("a1",A.class);
		  System.out.println(a1);
		
		  System.out.println("............................");
		  b1=factory.getBean("b1",B.class); System.out.println(b1);
		 
		
	}//main
}//class
