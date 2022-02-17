package com.kk.comp;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Named("dtdc")
public class DTDC implements ICourier {

	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}
	@Override
	public String deliver(int oId) {
		return "Order is delivered by DTDC with Order Id:: "+oId;
	}
}
