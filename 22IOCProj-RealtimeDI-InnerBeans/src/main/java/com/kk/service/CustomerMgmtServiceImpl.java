package com.kk.service;

import com.kk.bo.CustomerBO;
import com.kk.dao.ICustomerDAO;
import com.kk.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	private ICustomerDAO dao;

	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String clcInterestAmount(CustomerDTO dto) throws Exception {
		float intrAmt = 0.0f;
		CustomerBO bo = new CustomerBO();
		int count = 0;
		// calculate intrest amount
		intrAmt = (dto.getPAmt() * dto.getRate() * dto.getTime()) / 100.0f;
		// prepare CustomerBO object having persistable data...
		bo.setCName(dto.getCName());
		bo.setCAdd(dto.getCAdd());
		bo.setPAmt(dto.getPAmt());
		bo.setIntrAmt(intrAmt);
		count = dao.insertCustomer(bo);
		if (count == 0)
			return "Customer Registration failed :: Amt::" + dto.getPAmt() + "  intrest::" + intrAmt;
		else
			return "Customer Registration Succeded :: Amt::" + dto.getPAmt() + "  intrest::" + intrAmt;
	}

}
