package com.kk.test;

import com.kk.comp.Flipkart;
import com.kk.factory.FlipkartFactory;

public class TestStrategyDP {
	public static void main(String[] args) throws Exception {
		Flipkart fpkt=null;
		fpkt=FlipkartFactory.getInstance();
		System.out.println(fpkt.shopping(new double[] {
											2500,545,465},new String[] {
											"Pen","Coat","Pencil"
		}));
		
	}
}
