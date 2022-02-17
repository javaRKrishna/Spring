package com.kk.dao;

import com.kk.bo.CustomerBO;

public interface ICustomerDAO {
	public int insertCustomer(CustomerBO bo) throws Exception;
}
