package EngineComponent;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Utility.WebPageUtil;

public class Base extends WebPageUtil{
	
	public WebDriver driver;
	
	//TestNG framework method 
	 @Parameters("browser")
	 @BeforeSuite
		public void startReport() {

			ExtentHtmlReporter html = new ExtentHtmlReporter(System.getProperty("user.dir" ) + "/ExtentReport.html");
			ExtentReports report = new ExtentReports();
			report.attachReporter(html);
			System.out.println("Before-Suite");
	 }
	 

		
	@BeforeMethod
	public void beforemethod() {  // before open browser
		
		System.out.println("SECOND-Before-Method");
	}
	
	
	@AfterMethod
	public void aftermethod() { // after open the browser
		
		System.out.println("After-Method");
	}

	@AfterSuite
	public void aftersuite() { //close the browser
		
		System.out.println("After-Suite");
		
		driver.close();
	}
	}



