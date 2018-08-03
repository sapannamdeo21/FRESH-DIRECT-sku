package TestNG;

import java.io.IOException;
import java.nio.Buffer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import appModules.CopyProject;
import appModules.CreateProject;
import appModules.SignOff;
import appModules.SignIn;
import utility.Constants;
import utility.ExcelUtility;
import utility.FileMerger;
import utility.LaunchBrowser;
import utility.PlugInFunctions;

public class TestNG {

	private WebDriver driver;
	ExtentReports report = PlugInFunctions.reportGeneration();
	
	@BeforeMethod
	public void beforeMethod() throws IOException, InterruptedException {
		FileMerger.mergeFiles();
		driver = LaunchBrowser.execute(driver, report); 
	}

	@Test
	public void main() throws IOException, InterruptedException {

		ExcelUtility.setExcel(Constants.xcelPath + Constants.xcelfile, "Sheet1");
		SignIn.execute(driver, report);
		CopyProject.SearchProject(driver, report);
		//CreateProject.execute(driver, report);
	
	}
	
	@Test
	public void createproj() throws IOException, InterruptedException {

		ExcelUtility.setExcel(Constants.xcelPath + Constants.xcelfile, "Sheet1");
		SignIn.execute(driver, report);
		//CopyProject.SearchProject(driver, report);
		CreateProject.execute(driver, report);
	}
	@AfterMethod
	public void afterMethod() {

		SignOff.execute(driver);

	}

}
