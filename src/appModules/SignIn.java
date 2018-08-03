package appModules;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pageObjects.Pg_LoginLogOutPage;
import utility.Constants;
import utility.ExcelUtility;
import utility.PlugInFunctions;

public class SignIn {
	
	@SuppressWarnings("deprecation")
	public static void execute(WebDriver driver, ExtentReports report) throws IOException, InterruptedException {
		
		String sUserName = ExcelUtility.getCellValue(1, 1);
		String sPassword = ExcelUtility.getCellValue(1, 2);
		
		//ExtentReports report = new ExtentReports("E:\\Bin\\Selenium\\AutomationFramWork\\ExtendReports\\"+Constants.reportName+ ".html",true);
		//ExtentTest logger = report.startTest("Log-In");
		ExtentTest logger = report.startTest("Log-In");
		report.config().reportHeadline("Config Check");
		
	
		Pg_LoginLogOutPage.txt_UserName(driver).sendKeys(sUserName);
		logger.log(LogStatus.INFO, "Entered the UserName Successfully");
		Pg_LoginLogOutPage.txt_Password(driver).sendKeys(sPassword);
		
		logger.log(LogStatus.INFO, "Entered the Password Successfully");
		Pg_LoginLogOutPage.btn_clklogin(driver).click();
		logger.log(LogStatus.INFO, "Clicked on the log-on button Successfully");
		
		System.out.println(driver.getTitle().equals("SAP NetWeaver Portal"));
		
		if(driver.getTitle().equals("SAP NetWeaver Portal")==false) 
		{
					Boolean results = false;
					PlugInFunctions.errorHandling(driver, results, logger, "Login");
					report.flush();
		}
		
		report.endTest(logger);
		report.flush();
		
		PlugInFunctions.switchFrame(driver, PlugInFunctions.loadXPathfile().getProperty("ContentFrame"));
		PlugInFunctions.switchFrame(driver, PlugInFunctions.loadXPathfile().getProperty("IsolatedFrame"));
		//PlugInFunctions.expWait(driver, PlugInFunctions.loadXPathfile().getProperty("btn_createNewProject"));
		//driver.switchTo().defaultContent();
	}
}
