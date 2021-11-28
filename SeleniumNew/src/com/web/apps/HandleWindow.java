package com.web.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindow {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		String windowHandle = driver.getWindowHandle();
		System.out.println("Parent ID" + windowHandle);
		
		//.System.out.println(driver.getCurrentUrl() + driver.getTitle());
		WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys("Redmi Note 9 promax");
		WebElement b = driver.findElement(By.id("nav-search-submit-button"));
		b.click();
		
	}

}
