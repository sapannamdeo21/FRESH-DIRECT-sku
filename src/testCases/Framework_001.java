package testCases;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.DependencyMap;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModules.RFS_Action;
import appModules.SignIn_Action;
import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;


public class Framework_001 extends Utils {
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	
  @BeforeMethod
  
  
  public void beforeMethod() throws Exception {
	   DOMConfigurator.configure("log4j.xml");
	  	
	  	sTestCaseName = this.toString();
	  	sTestCaseName = Utils.getTestCaseName(this.toString());
	  	Log.startTestCase(sTestCaseName);
		
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
		
		driver = Utils.OpenBrowser(iTestCaseRow);
		
		
		new BaseClass(driver);  
		System.out.println("driver id " +driver); 
  }
  
  
  @Test 
  public void main() throws Exception {
	
	  
	  try{
		  driver.manage().window().maximize();
		  
		 System.out.println("frame iTestCaseRow " + iTestCaseRow);
		
		 SignIn_Action.Execute(iTestCaseRow);
		 RFS_Action.cliknewRFS(iTestCaseRow);
		
		 System.out.println("F01 starting frame switch ");
		 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	WebElement element = driver.findElement(By.xpath("//*[@id='contentFrameId']"));
 	 	driver.switchTo().frame(element);
    	System.out.println("frame swiched >>>>>>  ");
    	
		 RFS_Action.selecet_drop(iTestCaseRow);
		 RFS_Action.Requester_Info(iTestCaseRow);
		 RFS_Action.Calender(iTestCaseRow);
		 RFS_Action.Service_Area_Section(iTestCaseRow);
		 RFS_Action.aim_of_study(iTestCaseRow);
		 RFS_Action.expected_data(iTestCaseRow);
		 RFS_Action.method(iTestCaseRow);
		 RFS_Action.uplaod_file(iTestCaseRow);
		 RFS_Action.sample_section(iTestCaseRow);
		 RFS_Action.no_of_sample(iTestCaseRow);
		 RFS_Action.solid(iTestCaseRow);
		 RFS_Action.Inorganic(iTestCaseRow);
		 RFS_Action.organic(iTestCaseRow);
		 RFS_Action.powder(iTestCaseRow);
		 RFS_Action.film(iTestCaseRow);
		 RFS_Action.Inorganic(iTestCaseRow);
		 RFS_Action.fluid(iTestCaseRow);
		 RFS_Action.sample_specifications(iTestCaseRow);
		 RFS_Action.specific_instuction(iTestCaseRow);
		 RFS_Action.upload_flie_2(iTestCaseRow);
		 Thread.sleep(1000);
		 RFS_Action.next(iTestCaseRow);
		 //RFS_Action.return_samples(iTestCaseRow);
		 RFS_Action.sample_delivery_mode(iTestCaseRow);
		 RFS_Action.report(iTestCaseRow);
		 RFS_Action.submit(iTestCaseRow);
		 
		
		if(BaseClass.bResult==true){
			ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
		}else{
			throw new Exception("Test Case Failed because of Verification");
		}
		
	   
	  }catch (Exception e){
		
		  ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
		
		  Utils.takeScreenshot(driver, sTestCaseName);
		
		  Log.error(e.getMessage());
		
		  throw (e);
	  }
		
  }
  
  
  

		
  		
  @AfterMethod
  public void afterMethod() {
	
	   Log.endTestCase(sTestCaseName);
	   ExcelUtils.closeexcel();
	   Set<Cookie> allCookies = driver.manage().getCookies();
	//  driver.close();
	 
  		}

}
