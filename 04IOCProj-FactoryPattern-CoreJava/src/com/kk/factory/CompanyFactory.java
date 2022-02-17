package com.kk.factory;

import com.kk.comp.Cameras;
import com.kk.comp.ICompany;
import com.kk.comp.IItems;
import com.kk.comp.Softwares;
import com.kk.comp.TCS;
import com.kk.comp.iVIS;

public class CompanyFactory {
	public static ICompany getInstance(String type) {
		ICompany company=null;
		IItems items=null;
		if(type.equalsIgnoreCase("iVIS")) {
			items=new Softwares();
			company=new iVIS(items);
		}
		else if(type.equalsIgnoreCase("TCS")) {
			items=new Cameras();
			company=new TCS(items);
		}
		return company;
	}
}
