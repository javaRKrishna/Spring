package com.kk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.kk.comp.Student;

public class SetterConstructorInjectTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student stud=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/kk/cfgs/applicationContext.xml"));
		//get  spring bean class object
		stud=factory.getBean("stud",Student.class);
		System.out.println(stud);
		

	}

}
