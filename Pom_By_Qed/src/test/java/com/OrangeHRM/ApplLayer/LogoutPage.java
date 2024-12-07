package com.OrangeHRM.ApplLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {

	@FindBy(id = "welcome")
	WebElement welcome;

	@FindBy(xpath = "Logout")
	WebElement logout;

	public void logout() {
		welcome.click();
		logout.click();

	}

}
