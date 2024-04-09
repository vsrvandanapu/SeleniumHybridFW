package com.computech.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.computech.basepackage.BaseTest;

public class SampleTest2 extends BaseTest{

	@Test
	public void LoginAndLogoutTest() throws InterruptedException {
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		
	
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("srinivas@cisolutions.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@1");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		/*
		*/
	}

	@Test
	public void Login_CreateLeadAndLogoutTest() throws InterruptedException, IOException {
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("srinivas@cisolutions.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@1");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Close']")).click();
		driver.findElement(By.xpath("//input[@title='New']")).click();
		driver.findElement(By.xpath("//label[text()='First Name']//following::input[1]")).sendKeys("Priyanka");
		driver.findElement(By.xpath("//label[text()='Last Name']//following::input[1]")).sendKeys("VV");
		driver.findElement(By.xpath("//label[text()='Company']//following::input[1]")).sendKeys("CIS");
		Select leadSourceDropdown = new Select(driver.findElement(By.xpath("//label[text()='Lead Source']//following::select[1]")));
		leadSourceDropdown.selectByIndex(2);	
		Thread.sleep(3000);
		Select leadStatusDropdown = new Select(driver.findElement(By.xpath("//label[text()='Lead Status']//following::select[1]")));
		leadStatusDropdown.selectByIndex(2);	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Description']//following::textarea[1]")).sendKeys("This is a description");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[text()='Optional']//following::input[@title='Save']")).click();
		Thread.sleep(3000);
		/*
		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();*/

	}
}
