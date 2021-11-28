package com.qa.attribute.test;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void m1() {
		System.out.println("Login");
		Assert.fail();

	}
	@Test(dependsOnMethods = "m1")
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


