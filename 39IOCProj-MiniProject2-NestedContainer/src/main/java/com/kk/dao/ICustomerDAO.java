package com.kk.dao;

import java.util.List;

import com.kk.bo.CustomerBO;

public interface ICustomerDAO {
	public List<CustomerBO> getCustomer(String desg) throws Exception;
}
