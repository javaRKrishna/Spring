package com.kk.controller;

import com.kk.dto.CustomerDTO;
import com.kk.service.ICustomerMgmtService;
import com.kk.vo.CustomerVO;

public class CustomerMgmtController {
	private ICustomerMgmtService service;

	public CustomerMgmtController(ICustomerMgmtService service) {
		super();
		this.service = service;
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
