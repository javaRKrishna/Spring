package com.kk.beans;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	private String name;
	private int age;
	private String add;
	private Long mNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	@Required
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Long getmNo() {
		return mNo;
	}
	public void setmNo(Long mNo) {
		this.mNo = mNo;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", add=" + add + ", mNo=" + mNo + "]";
	}
}
