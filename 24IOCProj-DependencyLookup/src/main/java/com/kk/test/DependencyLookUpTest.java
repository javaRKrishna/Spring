package com.kk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kk.beans.Engine;
import com.kk.beans.Vehicle;

public class DependencyLookUpTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
		Vehicle vehicle=null;
		vehicle=factory.getBean("vehicle",Vehicle.class);
		System.out.println("1 st container");
		vehicle.jorney("Hyderabad","Bhopal");
		vehicle.playingMusic();
		vehicle.pressHorn();
		vehicle.applyBreak();
		
	}
}
