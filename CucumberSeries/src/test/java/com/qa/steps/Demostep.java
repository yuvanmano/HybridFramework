package com.qa.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demostep {
	WebDriver  driver;
	@Given ("lanuch url {string}")
	public void lanuch_url(String url) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	}
	@When ("passing invalid {string} and {string}")
	public void passing_invalid (String Username , String password) {
		
	}
	//@Then click the login button
}
