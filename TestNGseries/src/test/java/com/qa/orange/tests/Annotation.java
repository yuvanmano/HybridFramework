package com.qa.orange.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	/*@BeforeSuite
	 * @AfterSuite
	 * @BeforeTest
	 * @AfterTest
	 * @BeforeClass
	 * @AfterClass
	 * @BeforeMethod
	 * @AfterMethod
	 * @Test
	 * 
	 * @BeforeGroups
	 * @AfterGroups
	 * @Parameters
	 * @DataProvider*/
	 
	@Test
	private void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1");
	}
	@Test
	private void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}
	@Test
	private void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3");
	}
	
	
	
	@BeforeMethod
	private void beforemethod() {
		// TODO Auto-generated method stub
		System.out.println("beforemethod");

	}
	@AfterMethod
	private void aftermethod() {
		// TODO Auto-generated method stub
		System.out.println("aftermethod");

	}
	@BeforeClass
	private void beforeclass() {
		// TODO Auto-generated method stub
		System.out.println("beforeclass");
	}
	@AfterClass
	private void afterclass() {
		// TODO Auto-generated method stub
		System.out.println("afterclass");
	}
	@BeforeTest
	private void beforetest() {
		// TODO Auto-generated method stub
		System.out.println("beforetest");
	}
	@AfterTest
	private void aftertest() {
		// TODO Auto-generated method stub
		System.out.println("aftertest");
	}
	@BeforeSuite
	private void beforesuite() {
		// TODO Auto-generated method stub
		System.out.println("beforesuite");
	}
	@AfterSuite
	private void aftersuite() {
		// TODO Auto-generated method stub
		System.out.println("aftersuite");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
