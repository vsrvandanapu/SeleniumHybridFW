package com.computech.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.computech.constants.DriverType;

public class DriverManager {
	
//	public WebDriver initialize() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://login.salesforce.com/?locale=in");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		return driver;
//	}
	public WebDriver initialize() {
		WebDriver driver = null;
		String browser = System.getProperty("browser", "CHROME");
//		String browser = System.getProperty("browser");
		switch(DriverType.valueOf(browser))
		{
		case CHROME:
			driver = new ChromeDriver();
		break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case EDGE:
			driver = new EdgeDriver();
			break;	
		}
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		return driver;
		
	}

}
