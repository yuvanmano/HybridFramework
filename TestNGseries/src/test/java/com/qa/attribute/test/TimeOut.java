package com.qa.attribute.test;

import org.testng.annotations.Test;

public class TimeOut {
	@Test(timeOut = 1500)
	public void m1() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("m1");
		

	}
	@Test
	public void m2() {
		System.out.println("m2");
		

	}

}
