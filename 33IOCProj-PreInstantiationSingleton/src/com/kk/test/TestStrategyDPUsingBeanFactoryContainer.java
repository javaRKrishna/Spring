package com.kk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.kk.comp.Flipkart;

public class TestStrategyDPUsingBeanFactoryContainer {
	public static void main(String[] args) throws Exception {
		Resource res = new ClassPathResource("com/kk/cfgs/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		Flipkart fpkt=factory.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.shopping(new double[] {
											2500,545,465},new String[] {
											"Pen","Coat","Pencil"
		}));
		
	}
}
