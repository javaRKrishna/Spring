package com.kk.beans;

import java.util.Date;

public class WishMsgGenerator {
	private Date date;

	public WishMsgGenerator(Date date) {
		this.date = date;
	}

	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String generateMsg(String user) {
		System.out.println(date);
		int hour=0;
		hour = date.getHours();
		//b logic
		if(hour<12)
			return "Good Morning:: "+user;
		else if(hour<16)
			return "Good AfterNoon:: "+user;
		else if(hour<20)
			return "Good Evening:: "+user;
		else
			return "Good Night:: "+user;
	}
}
