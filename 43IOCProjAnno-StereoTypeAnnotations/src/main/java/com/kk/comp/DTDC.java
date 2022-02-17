package com.kk.comp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dtdc")
@Scope(scopeName = "prototype")
public class DTDC implements ICourier {

	public DTDC() {
		System.out.println("DTDC.DTDC()");
	}
	@Override
	public String deliver(int oId) {
		return "Order is delivered by DTDC with Order Id:: "+oId;
	}
}
