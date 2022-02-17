package com.kk.comp;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	// property
	@Autowired
	//@Qualifier("bt")
	@Qualifier("dtdc")
	private ICourier courier; // rule1 ,2
	@Autowired
	private Date sysDate;

	//@Autowired(required = true)
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}

	//@Autowired(required = false)
	public Flipkart(@Qualifier("bt") ICourier courier, Date sysDate) {
		this.courier = courier;
		this.sysDate = sysDate;
		System.out.println("Flipkart:: 2-param constructor");
	}

	@Autowired(required = false)
	public Flipkart(Date sysDate) {
		this.sysDate = sysDate;
		System.out.println("Flipkart:: 1-param constructor");
	}

	@Autowired(required = false)
	public Flipkart(@Qualifier("dtdc") ICourier courier) {
		this.courier = courier;
		System.out.println("Flipkart:: 1-param constructor");
	}

	@Autowired
	public void setSysDate(Date date) {
		System.out.println("Flipkart.setSysDate(-)");
		this.sysDate = date;
	}

	public String shopping(double[] prices, String[] items) {
		System.out.println("Flipkart.shopping()");
		float billAmt = 0.0f;
		int oid = 0;
		String msg = null;
		Random rad = null;
		// calculate bill Amount

		for (double p : prices)
			// billAmt=billAmt+p;
			billAmt += p;
		// generate order id dynamically as random number
		rad = new Random();
		oid = rad.nextInt(10000);
		// use courier service for delivering the products
		msg = courier.deliver(oid);
		// retrun bill Amt and courier details to customer
		return Arrays.toString(items) + " are purchased  having prices " + Arrays.toString(prices)
				+ "  with bill amount" + billAmt + "----" + msg;
	}
}
