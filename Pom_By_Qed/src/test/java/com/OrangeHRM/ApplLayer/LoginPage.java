package com.OrangeHRM.ApplLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "txtUsername")
	WebElement username;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement Login;

	public void login(String uname, String pass) {

		username.sendKeys(uname);
		password.sendKeys(pass);
		Login.click();

	}

}
