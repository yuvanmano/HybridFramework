package com.qa.attribute.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreMissingDependency {
	@Test(enabled = false)
	public void m1() {
		System.out.println("m1");
		Assert.fail();

	}
	@Test(dependsOnMethods = "m1",  ignoreMissingDependencies = true)
	public void m2() {
		System.out.println("m2");

	}
	@Test
	public void m3() {
		System.out.println("m3");

	}

}

