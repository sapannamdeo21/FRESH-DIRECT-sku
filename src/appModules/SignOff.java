package appModules;

import org.openqa.selenium.WebDriver;

import pageObjects.Pg_LoginLogOutPage;

public class SignOff {

	public static void execute(WebDriver driver) {
		
		driver.switchTo().defaultContent();
		Pg_LoginLogOutPage.lnk_clkLogout(driver).click();
		Pg_LoginLogOutPage.btn_LogoutConfirm(driver).click();

		driver.close();
		driver.quit();
	}
}
