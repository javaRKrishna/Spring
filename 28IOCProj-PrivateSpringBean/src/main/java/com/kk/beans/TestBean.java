package com.kk.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class TestBean {
	private int a, b;

	private TestBean() {
		System.out.println("TestBean.TestBean()");
	}

	private TestBean(int a, int b) {
		System.out.println("TestBean.TestBean() param cons");
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "TestBean [a=" + a + ", b=" + b + "]";
	}

	// nested class --static inner class
	private static class DemoBean { // nested class
		private int c;

		public DemoBean() {
			System.out.println("TestBean.DemoBean:: 0-param cosntructor");
		}

		public void setC(int c) {
			this.c = c;
		}

		@Override
		public String toString() {
			return "DemoBean [c=" + c + "]";
		}

	}

}
