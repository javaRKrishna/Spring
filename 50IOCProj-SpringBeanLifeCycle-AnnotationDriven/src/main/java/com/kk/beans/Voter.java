package com.kk.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Voter {
	@Value("Krishna")
	private String name;
	@Value("120")
	private float age;
	private Date dov;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public Date getDov() {
		return dov;
	}

	public void setDov(Date dov) {
		this.dov = dov;
	}

	// init life cycle method /custom life cycle method
	@PostConstruct
	public void myInit() {
		System.out.println("Voter.myInit()");
		dov = new Date();
		boolean flag = false;

		if (name == null) { // validation logic
			System.out.println(" name must not be null");
			flag = true;
		}

		if (age < 0)
			age = age * -1; // correcting the values //Bean post processing

		if (age > 100) { // validation logic
			System.out.println(" age must not >100");
			flag = true;
		}
		if (flag)
			throw new IllegalArgumentException(" invalid inputs");
	}

	// destroy life cycle method/custom destroy method
	@PreDestroy
	public void myDestroy() {
		System.out.println("Voter.myDestroy()");
		// nullify bean properties
		name = null;
		age = 0;
		dov = null;
	}

	// b.method
	public String checkVotingElgibility() {
		System.out.println("Voter.checkVotingElgibility()");
		// b.logic
		if (age >= 18)
			return "Mr/Miss/Mrs." + name + "  u  r  eglible for voting::" + age + "-->  on  ->" + dov;
		else
			return "Mr/Miss/Mrs." + name + "  u  r not  eglible for voting::" + age + "--> on->" + dov;
	}// method

	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + ", dov=" + dov + "]";
	}
	
	
}
