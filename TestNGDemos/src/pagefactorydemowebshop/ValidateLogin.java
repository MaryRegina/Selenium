package pagefactorydemowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactorydemo.LoginPOM;

public class ValidateLogin {
	WebDriver driver;

	@Test
	public void validateLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();

		LoginPOM loginPage = PageFactory.initElements(driver, LoginPOM.class);
		
		loginPage.typeEmail("jennifer1998@gmail.com");
		loginPage.typePassword("pass123$");
		loginPage.clickLogin();
		driver.close();
	}

}
