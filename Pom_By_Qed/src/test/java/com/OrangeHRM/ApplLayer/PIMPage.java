package com.OrangeHRM.ApplLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PIMPage {

	@FindBy(xpath = "//b[normalize-space()='PIM']")
	WebElement clickOnPIM;

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	WebElement clickOnAddEmployee;

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement EnterFristName;

	@FindBy(xpath = "//input[@id='middleName']")
	WebElement EnterMiddleName;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement EnterLastName;

	@FindBy(xpath = "//input[@id='employeeId']")
	WebElement captureEMPID;

	@FindBy(xpath = "//input[@id='btnSave']")
	WebElement clickOnsaveButton;

	public void pimPageData(String fname, String mname, String lname) {

		Assert.assertTrue(clickOnPIM.isDisplayed());
		clickOnPIM.click();
		clickOnAddEmployee.click();
		EnterFristName.sendKeys(fname);
		EnterMiddleName.sendKeys(mname);
		EnterLastName.sendKeys(lname);
		captureEMPID.getAttribute("value");
		clickOnsaveButton.click();
        
		
		
	}

}
