package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.ElementUtils;

public class LoginPage {
	private By username = By.id("input-email");
	private By password = By.id("input-password");
	private By forgottenPwdLink = By.xpath("(//div/a[text()='Forgotten Password'])[1]");
	private By login = By.xpath("//input[@type='submit']");
	private By loginLink = By.xpath("(//li/a[text()='Login'])[2]");

	private WebDriver driver; 
	private ElementUtils elementUtils;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		elementUtils = new ElementUtils(this.driver);
	}

	public String getLoginPageTitle() {
		return elementUtils.getPageTitle();

	}

	public void loginOpenCart(String uname, String pwd) {
		elementUtils.doSendKeys(username, uname);
		elementUtils.doSendKeys(password, pwd);
		elementUtils.clickAnElement(login);
	}

	public boolean loginLinkExist() {
		return elementUtils.isElementDisplayed(loginLink);

	}

	public boolean forgottenPwdLinkExist() {
		return elementUtils.isElementDisplayed(forgottenPwdLink);

	}

}
