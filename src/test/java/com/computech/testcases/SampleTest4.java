//package com.computech.testcases;
//
//import java.io.IOException;
//
//import org.testng.annotations.Test;
//
//import com.computech.basepackage.BaseTest;
//import com.computech.pages.HomePage;
//import com.computech.pages.LeadsPage;
//import com.computech.pages.LoginPage;
//import com.computech.utilities.ExcelReader;
//
//public class SampleTest4 extends BaseTest{
//
//	@Test
//	public void LoginAndLogoutTest() throws InterruptedException {
//		
//		Thread.sleep(3000);
//		LoginPage loginPage = new LoginPage(driver);
//		HomePage homePage =loginPage.loginToApplication();
//		homePage.logoutFromApplication();
//	}
//
//	@Test
//	public void Login_CreateLeadAndLogoutTest() throws InterruptedException, IOException {
//		Thread.sleep(3000);
//		LoginPage loginPage = new LoginPage(driver);
//		HomePage homePage =loginPage.loginToApplication();
//		Thread.sleep(3000);
//		LeadsPage leadsPage =homePage.leadsTab();
////		leadsPage.clickOnPopupCloseIcon()
//		leadsPage.clickOnNewLeadButton()
//				.createLead(ExcelReader.excelreading().get("firstName"), ExcelReader.excelreading().get("lastName"), 
//						ExcelReader.excelreading().get("companyName"), ExcelReader.excelreading().get("description"));
////				.clickOnSaveButton();
//		/*LeadsPage leadsPage =homePage.leadsTab();
//		leadsPage.clickOnPopupCloseIcon();
//		leadsPage.clickOnNewLeadButton();
//		leadsPage.createLead();
//		leadsPage.clickOnSaveButton();*/
//		//Thread.sleep(3000);
//		
//		//homePage.logoutFromApplication();
//
//	}
//}
