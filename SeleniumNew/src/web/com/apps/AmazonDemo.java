package web.com.apps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Iphone 13");
		driver.findElement(By.xpath("//input[@type='submit']")).click();	
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		driver.findElement(By.xpath("//input[@name='submit.add-to-cart']")).click();
	}

}
