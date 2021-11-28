package com.qa.attribute.test;

import org.testng.annotations.Test;

public class EnabledAttribute {
	@Test
	public void m1() {
		System.out.println("Login");

	}
	@Test(enabled = false)
	public void m2() {
		System.out.println("Order Product");

	}
	@Test
	public void m3() {
		System.out.println("Payment");

	}
	@Test
	public void m4() {
		System.out.println("Checkout");

	}

}
