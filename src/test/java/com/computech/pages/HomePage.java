package com.computech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.computech.basepackage.BasePage;

public class HomePage  extends BasePage{


	public HomePage(WebDriver driver) {
		super(driver);
	}

	private By btnUsernav = By.xpath("//div[@id='userNavButton']");
	
	private By lnkLogout = By.xpath("//a[text()='Logout']");
	
	private By tabLeads = By.xpath("//a[text()='Leads' and @title='Leads Tab']");
	
	private By tabAccounts = By.xpath("//a[text()='Accounts' and @title='Accounts Tab']");
	
	
	public void logoutFromApplication() {
		driver.findElement(btnUsernav).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(lnkLogout).click();
	}
	/*
	public void leadsTab() {
		driver.findElement(tabLeads).click();
	}*/
	public LeadsPage leadsTab() {
		driver.findElement(tabLeads).click();
		return new LeadsPage(driver);
	}
			
	public void accountsTab() {
		driver.findElement(tabAccounts).click();
	}
	
}
