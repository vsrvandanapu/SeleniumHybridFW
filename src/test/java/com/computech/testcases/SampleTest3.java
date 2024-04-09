package com.computech.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.computech.basepackage.BaseTest;
import com.computech.pages.HomePage;
import com.computech.pages.LeadsPage;
import com.computech.pages.LoginPage;

public class SampleTest3 extends BaseTest{

	@Test
	public void LoginAndLogoutTest() throws InterruptedException {
		
		Thread.sleep(3000);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApplication();
		HomePage homePage = new HomePage(driver);
		homePage.logoutFromApplication();
	}

	@Test
	public void Login_CreateLeadAndLogoutTest() throws InterruptedException, IOException {
		Thread.sleep(3000);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginToApplication();
		Thread.sleep(3000);
		HomePage homePage = new HomePage(driver);
		homePage.leadsTab();
		LeadsPage leadsPage = new LeadsPage(driver);
		leadsPage.clickOnPopupCloseIcon();
		leadsPage.clickOnNewLeadButton();
		leadsPage.createLead();
		leadsPage.clickOnSaveButton();
		Thread.sleep(3000);
		
		homePage.logoutFromApplication();

	}
}
