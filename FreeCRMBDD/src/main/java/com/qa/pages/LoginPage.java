package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{

	
	@FindBy(id="loginUserInput")
	WebElement username;
	
	@FindBy(id="loginUserPassword")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	
	public HomePage login(String un, String pw) {
		
		username.sendKeys(un);
		password.sendKeys(pw);
		
		loginBtn.click();
		
		return new HomePage();
	}
	
}
