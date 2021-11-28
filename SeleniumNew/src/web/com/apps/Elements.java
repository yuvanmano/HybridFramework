package web.com.apps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Elements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	/*	WebElement a = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		a.sendKeys("Admin");
		WebElement b = driver.findElement(By.id("txtPassword"));
		b.sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();*/
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		String parent= driver.getWindowHandle();
		System.out.println(parent);
		Set<String>s= driver.getWindowHandles();
		System.out.println(s);
}
}
