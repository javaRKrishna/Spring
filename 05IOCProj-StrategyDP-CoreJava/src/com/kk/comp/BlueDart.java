package com.kk.comp;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

public class BlueDart implements ICourier {

	@Override
	public String deliver(int oId) {
		return "Order is delivered by BlueDart with Order Id:: "+oId;
	}

	

}
