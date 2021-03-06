package com.kk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.kk.beans.Employee;
import com.kk.beans.Marks;
import com.kk.beans.Student;

public class ResolvingConstructorInjection {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Marks mk=null;
		Employee emp=null;
		Student stud=null;
		//create BeanFactory container
		factory=new XmlBeanFactory(new ClassPathResource("com/kk/cfgs/applicationContext.xml"));
		//get Bean object
		mk=factory.getBean("mk",Marks.class);
		System.out.println(mk);
		System.out.println("..........................................");
		emp=factory.getBean("emp",Employee.class);
		System.out.println(emp);
		System.out.println("........................................");
		stud=factory.getBean("st",Student.class);
		System.out.println(stud);

	}//main
}//class
