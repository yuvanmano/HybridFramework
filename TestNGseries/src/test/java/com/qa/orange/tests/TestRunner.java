package com.qa.orange.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner {
	@Test
	public void compareTwoString() {
		String s1 = "Manoharan";
		String s2 = "Manoharan";
		Assert.assertEquals(s1, s2);
		
		 // if(s1.equals(s2)) { System.out.println("Both are equal"); } else {
		 
		 // System.out.println("Both are unequal"); }
		 
	}

	@Test
	public void checkNumber() {
		int num = 2;
		Assert.assertTrue(num > 1);
	}
}
