package com.qa.attribute.test;

import org.testng.annotations.Test;

public class InvocationTimeout {
	@Test(invocationTimeOut = 1000, invocationCount = 3)
	public void m1() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1");
		

	}


}
