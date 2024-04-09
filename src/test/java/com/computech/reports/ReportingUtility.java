package com.computech.reports;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.computech.basepackage.BaseTest;

public class ReportingUtility extends BaseTest implements ITestListener{
	
	public ExtentSparkReporter sparkReporter; // GUI - Colour, Title, Path
	public ExtentReports extent;// System common information
	public ExtentTest test;  // updattion of test status in Reports
	
	public void onStart(ITestContext context) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Date d = new Date();
		String filePath = format.format(d);
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"\\src\\test\\resources\\MyReports\\MyExtentReport_"+filePath+".html");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Environment ", "QA");
		extent.setSystemInfo("Team Name ", "AET");
		extent.setSystemInfo("User Name ", "Vasu");
	}

	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case is passed.." + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case is failed.." + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case is skipped.." + result.getName());
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
