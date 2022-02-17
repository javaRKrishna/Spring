package com.kk.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.kk.beans.WishMsgGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMsgGenerator target=null;
		//Hold the name and Location of spring bean cfg file in Resource object
		res = new FileSystemResource("src/com/kk/cfgs/applicationContext.xml");
		//create IOC container/Spring container (Bean Factory)
		factory = new XmlBeanFactory(res);
		target=factory.getBean("wmsg",WishMsgGenerator.class);
		String result=target.generateMsg("Krishna");
		System.out.println(result);
	}
}
