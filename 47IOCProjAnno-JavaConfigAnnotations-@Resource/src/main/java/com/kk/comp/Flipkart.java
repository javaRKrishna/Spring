package com.kk.comp;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

//@Component("fpkt")
@Named
public class Flipkart {
	@Value("Krishna")
	private String name;
	
	@Value("${name}")
	private String pName;
	
	@Resource
	@Qualifier("dtdc")
	private ICourier courier; // rule1 ,2
	@Resource
	private Date sysDate;

	//@Autowired(required = true)
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}

	public String shopping(double[] prices, String[] items) {
		System.out.println("Flipkart.shopping()");
		System.out.println(name+" "+pName);
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
