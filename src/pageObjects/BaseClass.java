package pageObjects;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	public static WebDriver driver;
	//public static Set<Cookie> allCookies;
	public static boolean bResult;
	public  BaseClass(WebDriver driver){

		BaseClass.driver = driver;
		BaseClass.bResult = true;
		
	}

}
