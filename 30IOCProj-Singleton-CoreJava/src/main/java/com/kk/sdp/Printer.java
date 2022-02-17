package com.kk.sdp;

public class Printer {
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer.Printer()");
	}
	
	//static Fcatory method
	public static Printer getInstance() {
		if(INSTANCE==null)
			return INSTANCE= new Printer();
		else
			return INSTANCE;
	}
	
	public void printData(String msg) {
		System.out.println("Msg:"+msg);
	}
}
