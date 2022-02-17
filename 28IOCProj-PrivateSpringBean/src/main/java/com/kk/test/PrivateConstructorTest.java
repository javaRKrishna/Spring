package com.kk.test;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kk.beans.TestBean;

public class PrivateConstructorTest {
	public static void main(String[] args) {
		Class c;
		try {
			c = Class.forName("com.kk.beans.TestBean");
		Constructor con[] = c.getDeclaredConstructors();
		con[0].setAccessible(true);
		TestBean tb1=(TestBean) con[0].newInstance();
		System.out.println(tb1);
		
		con[1].setAccessible(true);
		TestBean tb2=(TestBean) con[1].newInstance(60,20);
		System.out.println(tb2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
