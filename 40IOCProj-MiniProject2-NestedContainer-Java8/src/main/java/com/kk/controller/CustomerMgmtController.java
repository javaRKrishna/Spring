package com.kk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.kk.dto.CustomerDTO;
import com.kk.service.ICustomerMgmtService;
import com.kk.vo.CustomerVO;

public class CustomerMgmtController {
	private ICustomerMgmtService service;

	public CustomerMgmtController(ICustomerMgmtService service) {
		super();
		this.service = service;
	}
	
	public List<CustomerVO> getCustomerInfo(String cAdd) throws Exception {
		List<CustomerDTO> listDTO=service.fetchCustomerInfo(cAdd);
		List<CustomerVO> listVO = new ArrayList<>();
		/*
		CustomerVO custVO=null;
		for (CustomerDTO customerDTO : listDTO) {
			custVO=new CustomerVO();
			BeanUtils.copyProperties(customerDTO, custVO);
			listVO.add(custVO);
		}
		return listVO;*/
		listDTO.forEach(dto -> {
			CustomerVO custVO = new CustomerVO();
			BeanUtils.copyProperties(dto, custVO);
			listVO.add(custVO);
		});
		return listVO;
	}
}
