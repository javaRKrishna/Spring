package com.kk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.kk.bo.CustomerBO;

@Repository
public class CustomerMysqlDAO implements ICustomerDAO {
	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO SPRING_CUSTOMER(CNAME,CADD,PAMT,INTRAMT) VALUES(?,?,?,?)";

	@Autowired(required = false)
	@Qualifier("mysqlHkds")
	private DataSource ds;

	@PostConstruct
	public void myInit() {
		if (ds == null)
			throw new IllegalArgumentException("ds not injected");
	}

	@PreDestroy
	public void myDestroy() {
		ds = null;
	}

	@Override
	public int insertCustomer(CustomerBO bo) throws Exception {
		Connection con = ds.getConnection();
		PreparedStatement ps = con.prepareStatement(CUSTOMER_INSERT_QUERY);
		ps.setString(1, bo.getCName());
		ps.setString(2, bo.getCAdd());
		ps.setFloat(3, bo.getPAmt());
		ps.setFloat(4, bo.getIntrAmt());
		int count = ps.executeUpdate();
		ps.close();
		con.close();
		return count;
	}

}
