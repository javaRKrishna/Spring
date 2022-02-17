package com.kk.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private ICourier courier;
	
	public Flipkart() {
		System.out.println("Flipkart.Flipkart()");
	}

	public Flipkart(ICourier courier) {
		System.out.println("Flipkart.Flipkart()");
		this.courier = courier;
	}
	
	public String shopping(double[] prices,String[] items) {
		System.out.println("Flipkart.shopping()");
		float billAmt=0.0f;
		 int oid=0;
		 String msg=null;
		 Random rad=null;
		//calculate  bill Amount
		 
		 for(double p:prices) 
			// billAmt=billAmt+p;
			 billAmt+=p;
		 //generate  order id dynamically as random number
		 rad=new Random();
		 oid= rad.nextInt(10000);
		 // use courier service for delivering the  products
		 msg=courier.deliver(oid);
		 // retrun bill Amt and courier details to customer
		return  Arrays.toString(items)+" are purchased  having prices "+Arrays.toString(prices)+"  with bill amount"+billAmt+ "----"+ msg;
	}
}
