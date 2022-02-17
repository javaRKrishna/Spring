package com.kk.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kk.dto.CustomerDTO;
import com.kk.service.ICustomerMgmtService;
import com.kk.vo.CustomerVO;

@Controller
public class CustomerMgmtController {
	@Autowired
	private ICustomerMgmtService service;

	@PostConstruct
	public void myInit() {
		 if(service==null)
			 throw new IllegalArgumentException("service not injected");
	}
	
	@PreDestroy
	public void myDestroy() {
		service=null;
	}
	
	public String insertCustomerInfo(CustomerVO vo) throws Exception {
		CustomerDTO dto=new CustomerDTO();
		dto.setCName(vo.getCName());
		dto.setCAdd(vo.getCAdd());
		dto.setPAmt(Float.parseFloat(vo.getPAmt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		String result=service.clcInterestAmount(dto);
		return result;
	}
}
