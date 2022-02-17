package com.kk.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.beans.Voter;

public class TestSBLC1 {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
		Voter voter = factory.getBean("voter1",Voter.class);
		System.out.println(voter.checkVotingElgibility());
		Voter voter2 = factory.getBean("voter2", Voter.class);
		System.out.println(voter2.checkVotingElgibility());
		factory.destroySingletons();
	}

}
