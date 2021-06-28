package com.qa.StepDefinitions;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.*;

public class LoginPageSteps extends TestBase {
	
	LoginPage loginPage = new LoginPage();
	HomePage homepage;

	@Given("^user Launches Browser$")
	public void user_Launches_Browser() throws Throwable {
	    
		TestBase.Initialization();
	   
	}

	@Then("^user is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
	   String title = loginPage.validateLoginPageTitle();
	   Assert.assertEquals("login", title);
	   
	}

	@Then("^user Logins in using Username and Password$")
	public void user_Logins_in_using_Username_and_Password() throws Throwable {
	    
		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	


	@Then("^Validate Homepage Title$")
	public void validate_Homepage_Title() throws Throwable {
	   String title = homepage.verifyHomePageTitle();
	   Assert.assertEquals("Capella University",title);
	}
}
