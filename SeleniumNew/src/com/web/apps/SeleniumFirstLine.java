package com.web.apps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstLine {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.amazon.in");
	//  String CurrentTitle = driver.getTitle();
	//	System.out.println("Title of the given app" + CurrentTitle);
	//	String CurrentUrl = driver.getCurrentUrl();
	//	System.out.println("Url of the given app" + CurrentUrl);
	//	driver.close();
	//	driver.manage().window().maximize();
	//	driver.manage().window().minimize();
	//	driver.navigate().to("https://www.facebook.com");
	//	driver.navigate().to("https://www.gmail.com");
	//	driver.navigate().back();
	//	driver.navigate().forward();
	//	driver.navigate().refresh();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window./location='https://www.google.com'");
		//System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
		//WebDriver driver = new InternetExploreDriver();
		//System.setProperty("webdriver.gecko.driver", "./driver/gecko.driver.exe");
		//WebDriver driver = new FirefoxDriver();
		
	}
}
