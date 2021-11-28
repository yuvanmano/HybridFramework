package com.web.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("singleframe");
		WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[position()=1]"));
		ele.sendKeys("CasteMarurom");
		driver.switchTo().defaultContent();
		WebElement ele2 = driver.findElement(By.xpath("//*[text()='Iframe with in an Iframe']"));
		ele2.click();
		//driver.switchTo().frame("Multiple");
		
		

	}

}
