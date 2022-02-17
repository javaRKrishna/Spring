package com.kk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.kk.bo.CustomerBO;

public class CustomerMysqlDAO implements ICustomerDAO {
	private static final String GET_CUSTOMER_DETAILS = "SELECT * FROM SPRING_CUSTOMER WHERE CADD=? ORDER BY CNAME";
	private DataSource ds;

	public CustomerMysqlDAO(DataSource ds) {
		System.out.println("CustomerMysqlDAO.CustomerMysqlDAO()");
		this.ds = ds;
	}

	@Override
	public List<CustomerBO> getCustomer(String desg) throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(GET_CUSTOMER_DETAILS);
		ps.setString(1, desg);
		ResultSet rs = ps.executeQuery();
		List<CustomerBO> listBO = new ArrayList<>();
		CustomerBO bo = null;
		while (rs.next()) {
			bo = new CustomerBO();
			bo.setCId(rs.getInt(1));
			bo.setCName(rs.getString(2)); 
			bo.setCAdd(rs.getString(3));
			bo.setPAmt(rs.getFloat(4));
			bo.setIntrAmt(rs.getFloat(5));
			listBO.add(bo);
		}
		ps.close();
		con.close();
		return listBO;
	}

}
