package pagefactorydemowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactorydemo.RegisterPOM;
import pagefactorydemo.LoginPOM;

public class TestRegisterAndLogin {
	
	WebDriver driver;

	@Test
	public void validateLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();

	    RegisterPOM registerPage = PageFactory.initElements(driver, RegisterPOM.class);
		
	    registerPage.selectGender();
	    registerPage.typeFirstName("malu");
	    registerPage.typeLastName("tii");
	    registerPage.typeEmail("malutiiii998@mail.com");
	    registerPage.typePassword("pass123$");
	    registerPage.typeConPassword("pass123$");
	    registerPage.clickRegister();
	    
	    driver.findElement(By.linkText("Log out")).click();
	    driver.findElement(By.linkText("Log in")).click();

        LoginPOM loginPage = PageFactory.initElements(driver, LoginPOM.class);
		
		loginPage.typeEmail("malutiiii1998@gmail.com");
		loginPage.typePassword("pass123$");
		loginPage.clickLogin();
		driver.close();
	    
	}

}
