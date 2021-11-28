package com.qa.attribute.test;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 0)
	public void m1() {
		System.out.println("m1");

	}

}
