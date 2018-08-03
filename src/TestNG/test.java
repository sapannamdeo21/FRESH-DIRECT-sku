package TestNG;
import java.sql.Driver;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {

	@Test
	
	public void addDepartmentTestCaseq() {
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	} 
	
	@Test
	public void addDepartmentTestCase() {
		System.out.println("Im in add department test case");
	}
	
	@Test
	public void addEmployeeTestCase() {
		System.out.println("Im in add employee test case");
	}
}