package com.computech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.computech.basepackage.BasePage;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	// private variables
	private By txtboxUsername = By.xpath("//input[@id='username']");
	private By textboxPassword = By.xpath("//input[@id='password']");
	private By btnLogin = By.xpath("//input[@id='Login']");
	// action mehtods
	public void typeUsername() {
		driver.findElement(txtboxUsername).sendKeys("srinivas@cisolutions.com");
	}
	public void typePassword() {
		driver.findElement(textboxPassword).sendKeys("Selenium@1");
	}
	public void clickOnLoginButton() {
		driver.findElement(btnLogin).click();
	}
	/*public void loginToApplication() {
		driver.findElement(txtboxUsername).sendKeys("srinivas@cisolutions.com");
		driver.findElement(textboxPassword).sendKeys("Selenium@1");
		driver.findElement(btnLogin).click();
	}*/
	public void loginToApplication(String uName, String pwd) {
		driver.findElement(txtboxUsername).sendKeys(uName);
		driver.findElement(textboxPassword).sendKeys(pwd);
		driver.findElement(btnLogin).click();
	}
	public HomePage loginToApplication() {
		driver.findElement(txtboxUsername).sendKeys("srinivas@cisolutions.com");
		driver.findElement(textboxPassword).sendKeys("Selenium@1");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(btnLogin).click();
		return new HomePage(driver);
	}

}
