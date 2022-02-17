package com.kk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kk.dto.CustomerDTO;
import com.kk.service.ICustomerMgmtService;
import com.kk.vo.CustomerVO;

@Controller
public class CustomerMgmtController {
	@Autowired
	private ICustomerMgmtService service;
	
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
