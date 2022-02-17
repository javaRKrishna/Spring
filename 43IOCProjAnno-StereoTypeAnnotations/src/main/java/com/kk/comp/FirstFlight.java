package com.kk.comp;

import org.springframework.stereotype.Component;

@Component("ff")
public class FirstFlight implements ICourier {

	public FirstFlight() {
		System.out.println("FirstFlight.FirstFlight()");
	}
	@Override
	public String deliver(int oId) {
		return "Order is delivered by FirstFlight with Order Id:: "+oId;
	}

	

}
