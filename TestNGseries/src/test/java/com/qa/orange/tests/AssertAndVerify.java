package com.qa.orange.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertAndVerify {
	@Test
	public void compareTwoString() {

		System.out.println("-------Start--------");
		String s1 = "Manoharan";
		String s2 = "manoharan";
		Assert.assertEquals(s1, s2);

	
		/* if(s1.equalsIgnoreCase(s2)) { System.out.println("Same"); }
		 
		 else {
		 
		  System.out.println("Different");
		  
		  }*/
		 
		System.out.println("---------End---------");

	}

	@Test
	public void checkNumber() {
		System.out.println("---------Start---------");
		int num = 2;
		Assert.assertTrue(num < 0);
		
		/* if (num < 0) {
		  
		  System.out.println("Large");
		  
		 } else { System.out.println("Small"); }*/
		 
		System.out.println("-------End--------");
	}

}
