package com.web.apps;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoWindow {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	String windowHandle = driver.getWindowHandle();
	System.out.println("Parent window"+ windowHandle );

	
	WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
	s.sendKeys("oneplusnord");
	s.sendKeys(Keys.ENTER);
	
	List<WebElement> mob = driver.findElements(By.xpath("(//div//h2)[position()<=6]"));
	
	for(int i=0;i<=mob.size();i++)
	{
		
		mob.get(1).click();
		
		
	}
	
	Set<String> s1 = driver.getWindowHandles();
	System.out.println(s1);
	
	int count=0;
	for(String s3:s1) {
		if(count==3) {
			
			driver.switchTo().window(s3);
			System.out.println(driver.getTitle());
			
		}
			
		count++;	
	}
	
	
	}

}