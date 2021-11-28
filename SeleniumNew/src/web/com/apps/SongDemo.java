package web.com.apps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SongDemo {
	
	public static void main(String[]args)  {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//input[@type='text']"));
		a.sendKeys("oru naalil vazhkai");
		WebElement b = driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']"));
		b.click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement c = driver.findElement(By.xpath("//a[@title='Oru Naalil Video Song | Pudhupettai | Dhanush | Yuvan Shankar Raja | Na Muthukumar | Selvaraghavan']"));
		c.click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("The Current URL :"+ currentUrl);
		String title = driver.getTitle();
		System.out.println("The Title is "+ title);
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		
	}
}