package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageObjects.Pg_LoginLogOutPage;

public class LaunchBrowser {

	//public static Properties propGet ;
	
	public static WebDriver execute(WebDriver driver, ExtentReports report){
		
		 //report = new ExtentReports("D:\\incture\\AutomationFramWork\\ExtendReports\\"+Constants.reportName+ ".html");
		ExtentTest logger = report.startTest("Launch Browser");
		//ExtentTest logger = report.startTest("Launch Browser");
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		driver = new ChromeDriver();
		logger.log(LogStatus.INFO, "Driver intiantiated");

		driver.get(Constants.URL);
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Maximize the browser and Open the application");
		
		Boolean results =  Pg_LoginLogOutPage.txt_UserName(driver).isEnabled();
		PlugInFunctions.errorHandling(driver, results, logger, "Portal Launch");

		report.endTest(logger);
		report.flush();
		
		return driver;
		
	}
}
