package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateProfile {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://chromedriver11.exe");
		driver = new ChromeDriver();
		
		driver.get("http://hrapps.britindia.com");
		Thread.sleep(20000);
		driver.findElement(By.xpath("/html/body/div/div[1]/center/div/div[3]/form/div[1]/input")).sendKeys("ssurapaneni@britindia.com");
		driver.findElement(By.xpath("/html/body/div/div[1]/center/div/div[3]/form/div[2]/input")).sendKeys("cherry");
		Thread.sleep(20000);
		///Select userTypeDropdown = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/center/div/div[3]/form/div[3]/select")));
	
		//userTypeDropdown.selectByVisibleText("Britannia User");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/center/div/div[3]/form/div[3]/button")).click();
		//driver.manage().window().maximize();
		Thread.sleep(20000);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div[3]/div/div[2]/span/img")).click();
		Thread.sleep(10000);
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[1]/div[1]/button")).click();
		Thread.sleep(10000);
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/div[2]/table/tbody/tr[1]/td[2]")).click();
		Thread.sleep(10000);
		Thread.sleep(20000);
		driver.findElement(By.linkText("New Applicantions")).click();
		Thread.sleep(10000);
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[3]/div/div/div/div[1]/button")).click();
		//Thread.sleep(10000);
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[3]/div/div[1]/div/div[1]/ul/li[1]")).click();
		///Thread.sleep(10000);
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/div[2]/div[1]/input")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/div[2]/div[1]/div[1]/ul/li/div/table//*[@id='datepicker-1075-9206-title']")).click();
		
		
		fillCandidateForm();
	}
public static void fillCandidateForm() throws InterruptedException{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/div[1]/div[1]/input")).sendKeys("Sumit");
	driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/div[1]/div[2]/input")).sendKeys("Kumar");
	/*try {
		driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/div[2]/div[1]/input"))
				.click();
		driver.findElement(By.xpath("//*[@id='datepicker-540-1757-29']/button")).click();
		
	} catch (Exception e) {
System.out.println(e.getStackTrace());
	}*/
	//finally{
Select genderType = new Select(driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/div[2]/div[2]/select")));
	genderType.selectByVisibleText("Male");
	driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/div[3]/div[1]/input")).sendKeys("amit.kumar@incture.com");
	driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/div[3]/div[2]/input")).sendKeys("9902817262");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/div[2]/div[1]/input")).sendKeys("22-02-1994");
	//Thread.sleep(20000);
	//driver.findElement(By.id("datepicker-756-2753-title")).click();
	//driver.findElement(By.xpath("//*[@id='wrapper']/div[2]/div/div/div[2]/div/form/div[1]/div/div[4]/div[2]/label/input")).click();
	
	
	
	
	//}
}
}