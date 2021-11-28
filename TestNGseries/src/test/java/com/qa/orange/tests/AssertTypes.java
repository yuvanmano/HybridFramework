package com.qa.orange.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTypes {
	@Test
	public void compareTwoString() {

		System.out.println("-------Start--------");
		String s1 = "Manoharan";
		String s2 = "manoharan";
		//Assert.assertEquals(s1, s2);
		
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(s1, s2);
		System.out.println("---------End---------");
		soft.assertAll();
		
	

	}

	@Test
	public void checkNumber() {
		System.out.println("---------Start---------");
		int num = 2;
		//Assert.assertTrue(num > 5);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(num>5);
		System.out.println("-------End--------");
		soft.assertAll();
	}

}
