package com.qa.orange.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginOrange {
	@DataProvider
	public Object[][] testData() {
		Object[][] credentials = {  { "Mano", "Mano123" }, 
									{ "Palani", "Palani123" },
									{ "Sabari", "Sabari123" },
									{ "Sai", "Sai123" },
									{ "Gowtham", "Gowtham123" }, 
									{ "vicky", "Vicky123" } };
		return credentials;
	}


	@Test(dataProvider="testData")
	public void loginApp(String uname, String pwd) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}

}
