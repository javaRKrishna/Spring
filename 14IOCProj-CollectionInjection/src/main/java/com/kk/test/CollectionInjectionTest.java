package com.kk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kk.beans.CollegeInfo;
import com.kk.beans.ContactInfo;
import com.kk.beans.MarksInfo;
import com.kk.beans.UniversityInfo;

public class CollectionInjectionTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory= new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
		MarksInfo marksInfo=factory.getBean("marks",MarksInfo.class);
		System.out.println(marksInfo);
		CollegeInfo clgInfo=factory.getBean("clg",CollegeInfo.class);
		System.out.println(clgInfo);
		ContactInfo contInfo=factory.getBean("contact",ContactInfo.class);
		System.out.println(contInfo);
		UniversityInfo unvInfo=factory.getBean("univ",UniversityInfo.class);
		System.out.println(unvInfo);
	}
}
