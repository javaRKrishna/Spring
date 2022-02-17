package com.kk.comp;

import javax.inject.Named;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Named("dt")
public class BlueDart implements ICourier {
	public BlueDart() {
		System.out.println("BlueDart.BlueDart()");
	}
	@Override
	public String deliver(int oId) {
		return "Order is delivered by BlueDart with Order Id:: "+oId;
	}

	

}
