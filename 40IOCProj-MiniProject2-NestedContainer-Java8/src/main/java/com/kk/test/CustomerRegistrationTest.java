package com.kk.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.controller.CustomerMgmtController;
import com.kk.vo.CustomerVO;

public class CustomerRegistrationTest {
	public static void main(String[] args) {
		ApplicationContext parentCtx=null,childCtx=null;
		childCtx = new ClassPathXmlApplicationContext("com/kk/cfgs/business-beans.xml");
		parentCtx = new ClassPathXmlApplicationContext(new String[] {"com/kk/cfgs/applicationContext.xml"},childCtx);
		CustomerMgmtController controller = parentCtx.getBean("controller", CustomerMgmtController.class);
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Customer Addreshh: ");
		String cAdd = scn.nextLine();
		try {
			List<CustomerVO> listVO = controller.getCustomerInfo(cAdd);
			/*if (!listVO.isEmpty()) {
				for (CustomerVO customerVO : listVO) {
					System.out.println(customerVO);
				}
			}else {
				System.out.println("No Reocrd Found");
			}*/
			/*
			listVO.forEach(vo ->{
				System.out.println(vo);
			});*/
			
			listVO.forEach(vo ->System.out.println(vo) );
			
			listVO.forEach(System.out::println);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((AbstractApplicationContext) childCtx).close();
		((AbstractApplicationContext) parentCtx).close();
	}
}
