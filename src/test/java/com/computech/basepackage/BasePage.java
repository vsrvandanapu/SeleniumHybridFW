package com.computech.basepackage;

import org.openqa.selenium.WebDriver;

public class BasePage {
	// It will contain the common code for all the pages
	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}

}
