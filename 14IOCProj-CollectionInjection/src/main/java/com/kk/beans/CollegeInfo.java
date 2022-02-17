package com.kk.beans;

import java.util.Date;
import java.util.List;

public class CollegeInfo {
	private List<String> studNames;
	private List<Date> listDate;
	public List<String> getStudNames() {
		return studNames;
	}
	public void setStudNames(List<String> studNames) {
		this.studNames = studNames;
	}
	public List<Date> getListDate() {
		return listDate;
	}
	public void setListDate(List<Date> listDate) {
		this.listDate = listDate;
	}
	@Override
	public String toString() {
		return "CollegeInfo [studNames=" + studNames + ", listDate=" + listDate + "]";
	}
	
	
}
