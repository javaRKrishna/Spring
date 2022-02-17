package com.kk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.kk.bo.CustomerBO;
import com.kk.dao.ICustomerDAO;
import com.kk.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	private ICustomerDAO dao;

	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<CustomerDTO> fetchCustomerInfo(String add) throws Exception {
		
		List<CustomerBO> listBO=dao.getCustomer(add);
		List<CustomerDTO> listDTO=new ArrayList<CustomerDTO>();
		CustomerDTO dto=null;
		for (CustomerBO customerBO : listBO) {
			 dto=new CustomerDTO();
			BeanUtils.copyProperties(customerBO, dto);
			listDTO.add(dto);
		}
		return listDTO;
	}

}
