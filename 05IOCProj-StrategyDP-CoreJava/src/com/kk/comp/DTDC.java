package com.kk.comp;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

public class DTDC implements ICourier {

	@Override
	public String deliver(int oId) {
		return "Order is delivered by DTDC with Order Id:: "+oId;
	}

	

}
