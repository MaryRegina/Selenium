package demowebshoptest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pompackage.LoginPagePom;

public class VerifyLogin {
	WebDriver driver;
	
	@Test
	public void checkLogin() {
		 System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
	     driver = new ChromeDriver(); 
	     driver.get("http://demowebshop.tricentis.com/login"); 
		 driver.manage().window().maximize(); 
			
		 LoginPagePom login=new LoginPagePom(driver);
		 login.enterEmail("jennifer1998@gmail.com");
		 login.enterPassword("pass123$");
		 login.clickLogin();
		 driver.close();
	}

}
