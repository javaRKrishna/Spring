package com.kk.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kk.controller.CustomerMgmtController;
import com.kk.vo.CustomerVO;

public class CustomerRegistrationTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/kk/cfgs/applicationContext.xml");
		CustomerMgmtController controller=factory.getBean("controller",CustomerMgmtController.class);
		CustomerVO vo=new CustomerVO();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		vo.setCName(scn.nextLine());
		System.out.println("Enter Customer Addreshh: ");
		vo.setCAdd(scn.nextLine());
		System.out.println("Enter Principal Ammount: ");
		vo.setPAmt(scn.nextLine());
		System.out.println("Enter Rate Of interest: ");
		vo.setRate(scn.nextLine());
		System.out.println("Enter Time: ");
		vo.setTime(scn.nextLine());
		try {
			String result=controller.insertCustomerInfo(vo);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
