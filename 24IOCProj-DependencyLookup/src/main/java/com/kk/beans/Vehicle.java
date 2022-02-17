package com.kk.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class Vehicle {
	private String beanId;

	public Vehicle(String beanId) {
		System.out.println("Vehicle.Vehicle()");
		this.beanId = beanId;
	}
	
	public void playingMusic() {
		System.out.println("Music is playing");
	}
	
	public void pressHorn() {
		System.out.println("Pressing Horn");
	}
	
	public void applyBreak() {
		System.out.println("Applying Break");
	}
	
	public void jorney(String sourcePlace,String destPlace) {
		System.out.println("Happy Starts");
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
		Engine engine=null;
		engine=factory.getBean(beanId,Engine.class);
		engine.start();
		System.out.println("Happy Journey from "+sourcePlace+" to "+destPlace);
		engine.stop();
		
	}
}
