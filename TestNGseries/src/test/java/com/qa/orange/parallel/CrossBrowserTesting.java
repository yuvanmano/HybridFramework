package com.qa.orange.parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void init_Browser(String browserName) {
		switch (browserName.toUpperCase()) {
		case "CHORME":
			System.out.println("CHROME "+ Thread.currentThread().getId() );
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "IE":
			System.out.println("IE "+ Thread.currentThread().getId() );
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		default:
			System.out.println("FF "+ Thread.currentThread().getId() );
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();

		}

	}
}