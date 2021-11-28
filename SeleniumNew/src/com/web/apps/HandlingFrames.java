package com.web.apps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("iamframe");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("Manoharan");
		driver.switchTo().frame(0);
		WebElement ele2 = driver.findElement(By.id("a"));
		ele2.click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		WebElement ele3 = driver.findElement(By.id("animals"));
		ele3.click();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.switchTo().frame("iamframe");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		ele.sendKeys("Manoharan");
		driver.switchTo().frame(0);
		WebElement checkBox = driver.findElement(By.id("a"));
		checkBox.click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement ele2 = driver.findElement(By.id("animals"));
		ele2.click();
		List<WebElement> options = driver.findElements(By.xpath("//*[@id='animals']/option"));
		for (int i = 0; i <options.size(); i++) {
			System.out.println(options.get(i).getText());

		}
	}
}*/