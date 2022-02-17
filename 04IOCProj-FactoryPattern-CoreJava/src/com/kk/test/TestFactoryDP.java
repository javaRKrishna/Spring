package com.kk.test;

import com.kk.comp.ICompany;
import com.kk.factory.CompanyFactory;

public class TestFactoryDP {
	public static void main(String[] args) {
		ICompany company=null;
		company=CompanyFactory.getInstance("TCS");
		company.production();
		
		company=CompanyFactory.getInstance("ivis");
		company.production();
	}
}
