package com.computech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.computech.basepackage.BasePage;

public class LeadsPage  extends BasePage{


	public LeadsPage(WebDriver driver) {
		super(driver);
	}

	private By btnNew = By.xpath("//input[@title='New']");
	private By popupClose = By.xpath("//a[text()='Close']");
	private By btnEdit = By.xpath("//h2[text()='Lead Detail']/following::input[@title='Edit'][position()='1']");
	private By existingLead = By.xpath("//h3[text()='Recent Leads']//following::tr[2]/th/a");
	private By txtBoxFirstName = By.xpath("//label[text()='First Name']//following::input[1]");
	private By txtBoxLastName = By.xpath("//label[text()='Last Name']//following::input[1]");
	private By txtBoxCompanyName = By.xpath("//label[text()='Company']//following::input[1]");
	private By dropdownLeadSource = By.xpath("//label[text()='Lead Source']//following::select[1]");
	/*private By optionLeadSourceWeb = By
			.xpath("//label[text()='Lead Source']//following::select[1]/option[@value='Web']");
	private By optionLeadSourcePhoneInquiry = By
			.xpath("//label[text()='Lead Source']//following::select[1]/option[@value='Phone Inquiry']");
	private By optionLeadSourcePartnerRefferal = By
			.xpath("//label[text()='Lead Source']//following::select[1]/option[@value='Partner Referral']");
	private By optionLeadSourcePurchasedList = By
			.xpath("//label[text()='Lead Source']//following::select[1]/option[@value='Purchased List']");
	private By optionLeadSourceOther = By
			.xpath("//label[text()='Lead Source']//following::select[1]/option[@value='Other']");
	*/
	private By dropdownLeadStatus = By.xpath("//label[text()='Lead Status']//following::select[1]");
	/*private By optionLeadStatusOpen = By
			.xpath("//label[text()='Lead Status']//following::select[1]/option[@value='Open - Not Contacted']");
	private By optionLeadStatusWorking = By
			.xpath("//label[text()='Lead Status']//following::select[1]/option[@value='Working - Contacted']");
	private By optionLeadStatusClosedConverted = By
			.xpath("//label[text()='Lead Status']//following::select[1]/option[@value='Closed - Converted']");
	private By optionLeadStatusClosedNotConverted = By
			.xpath("//label[text()='Lead Status']//following::select[1]/option[@value='Closed - Not Converted']");
	*/
	private By txtAreaDescription = By.xpath("//label[text()='Description']//following::textarea[1]");
	private By btnSave = By.xpath("//h3[text()='Optional']//following::input[@title='Save']");
	private By btnSaveAndNew = By.xpath("//h3[text()='Optional']//following::input[@title='Save & New']");
	private By btnCancel = By.xpath("//h3[text()='Optional']//following::input[@title='Cancel']");

	public LeadsPage clickOnNewLeadButton() {
		driver.findElement(btnNew).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new LeadsPage(driver);
	}

	public LeadsPage clickOnPopupCloseIcon() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(popupClose).click();
		
		return new LeadsPage(driver);
	}
	/*
	public void createLead() throws InterruptedException {
		driver.findElement(txtBoxFirstName).sendKeys("Nikhil");
		driver.findElement(txtBoxLastName).sendKeys("VV");
		driver.findElement(txtBoxCompanyName).sendKeys("Computech");
		Thread.sleep(3000);
		Select selLeadSource = new Select(driver.findElement(dropdownLeadSource));
		selLeadSource.selectByIndex(1);
		Thread.sleep(3000);
		Select selLeadStatus = new Select(driver.findElement(dropdownLeadSource));
		selLeadStatus.selectByIndex(1);
		driver.findElement(txtAreaDescription).sendKeys("This is a description");
		Thread.sleep(3000);
	}*/
	public LeadsPage createLead() throws InterruptedException {
		driver.findElement(txtBoxFirstName).sendKeys("swarag");
		driver.findElement(txtBoxLastName).sendKeys("nivas");
		driver.findElement(txtBoxCompanyName).sendKeys("Computech");
		Thread.sleep(3000);
		Select selLeadSource = new Select(driver.findElement(dropdownLeadSource));
		selLeadSource.selectByIndex(1);
		Thread.sleep(3000);
		Select selLeadStatus = new Select(driver.findElement(dropdownLeadSource));
		selLeadStatus.selectByIndex(1);
		driver.findElement(txtAreaDescription).sendKeys("This is a description");
		Thread.sleep(3000);
		return new LeadsPage(driver);
	}

	public LeadsPage createLead(String fName, String lName, String cName, String desc) {
		driver.findElement(txtBoxFirstName).sendKeys(fName);
		driver.findElement(txtBoxLastName).sendKeys(lName);
		driver.findElement(txtBoxCompanyName).sendKeys(cName);
		Select selLeadSource = new Select(driver.findElement(dropdownLeadSource));
		selLeadSource.selectByIndex(1);
		Select selLeadStatus = new Select(driver.findElement(dropdownLeadSource));
		selLeadStatus.selectByIndex(1);
		driver.findElement(txtAreaDescription).sendKeys(desc);
		return new LeadsPage(driver);
	}

//	public LeadsPage clickOnSaveButton() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		driver.findElement(btnSave).click();
//		return new LeadsPage(driver);
//	}

	public void clickOnSaveButton() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(btnSave).click();
	}
	public LeadsPage clickOnCancelButton() {

		driver.findElement(btnCancel).click();
		return new LeadsPage(driver);
	}

}
