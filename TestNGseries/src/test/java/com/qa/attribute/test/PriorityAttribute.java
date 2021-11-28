package com.qa.attribute.test;

import org.testng.annotations.Test;

public class PriorityAttribute {
	@Test(priority = -1)
	public void Gowtham() {
		System.out.println("m6");

	}
	
	@Test
	public void Vicky() {
		System.out.println("m4");
	}
	@Test(priority = 1)
	public void Sai() {
		System.out.println("m5");

	}
	@Test(priority = 1)
	public void Mano() {
		System.out.println("m1");

	}
	@Test(priority = 2)
	public void Palani() {
		System.out.println("m2");

	}
	@Test(priority = 3)
	public void Jothi() {
		System.out.println("m3");

	}

}