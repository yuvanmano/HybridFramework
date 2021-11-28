package com.qa.attribute.test;

import org.testng.annotations.Test;

public class ExpectedException {
	@Test(expectedExceptions = ArithmeticException.class)
	public void m1() {
		System.out.println(1/0);
	}
@Test(expectedExceptions = Exception.class)	
public void m2() {
	String str = null;
	System.out.println(str.length());

}
}
