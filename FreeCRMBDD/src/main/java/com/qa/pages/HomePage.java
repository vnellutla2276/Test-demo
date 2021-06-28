package com.qa.pages;

import com.qa.util.TestBase;

public class HomePage extends TestBase{

	public String verifyHomePageTitle() {
		
		String title = driver.getTitle();
		return title;
	}
	
}
