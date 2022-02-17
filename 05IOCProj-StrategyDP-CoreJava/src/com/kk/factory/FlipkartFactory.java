package com.kk.factory;

import com.kk.comp.BlueDart;
import com.kk.comp.DTDC;
import com.kk.comp.FirstFlight;
import com.kk.comp.Flipkart;
import com.kk.comp.ICourier;

public class FlipkartFactory {
	public static Flipkart getInstance(String courierName) {
		Flipkart flipkart=null;
		ICourier courier=null;
		if(courierName.equalsIgnoreCase("DTDC"))
			courier=new DTDC();
		else if(courierName.equalsIgnoreCase("FirstFlight"))
			courier=new FirstFlight();
		else if(courierName.equalsIgnoreCase("BlueDart"))
			courier=new BlueDart();
		else 
			 throw new  IllegalArgumentException(" Invalid courier name");
		flipkart=new Flipkart(courier);
		return flipkart;
	}
}
