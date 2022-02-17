package com.kk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kk.beans.Voter;

public class TestSBLC {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/kk/cfgs/applicationContext.xml");
		Voter voter = ctx.getBean("voter1", Voter.class);
		System.out.println(voter.checkVotingElgibility());
		
		Voter voter2 = ctx.getBean("voter2", Voter.class);
		System.out.println(voter2.checkVotingElgibility());
		// close container
		((AbstractApplicationContext) ctx).close();
	}

}
