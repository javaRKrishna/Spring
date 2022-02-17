package com.kk.service;

import java.util.List;

import com.kk.dto.CustomerDTO;

public interface ICustomerMgmtService {
	public  List<CustomerDTO> fetchCustomerInfo(String add) throws Exception;
}
