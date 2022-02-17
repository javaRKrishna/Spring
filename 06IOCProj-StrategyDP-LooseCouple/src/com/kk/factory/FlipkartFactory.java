package com.kk.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.kk.comp.Flipkart;
import com.kk.comp.ICourier;

public class FlipkartFactory {
	private static Properties prop;
	static {
		try {
			InputStream is = null;
			is = new FileInputStream("src/com/kk/commons/input.properties");
			prop = new Properties();
			prop.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Flipkart getInstance() throws Exception{
		Flipkart flipkart = null;
		ICourier courier = null;
		courier =(ICourier) Class.forName(prop.getProperty("sdp.dependent")).newInstance(); 
		flipkart = new Flipkart(courier);
		return flipkart;
	}
}
