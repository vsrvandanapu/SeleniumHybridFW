package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.computech.basepackage.BaseTest;

public class SampleTest extends BaseTest{
	@Test(priority=1)
	public void loginAndLogout() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://login.salesforce.com/?locale=in");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("srinivas@cisolutions.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@1");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@Test(priority=2)
	public void CreatedLeadAndLogout() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://login.salesforce.com/?locale=in");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("srinivas@cisolutions.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Selenium@1");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
		driver.findElement(By.xpath("//input[@title='New']")).click();
		driver.findElement(By.xpath("//label[text()='Last Name']//following::input[1]")).sendKeys("Neelima");
		driver.findElement(By.xpath("//label[text()='Company']//following::input[1]")).sendKeys("CIS");
		driver.findElement(
				By.xpath("//label[text()='Lead Status']//following::select[1]/option[@value='Closed - Converted']"))
				.click();
		driver.findElement(By.xpath("(//input[@title='Save'])[2]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@id='userNav-arrow']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
