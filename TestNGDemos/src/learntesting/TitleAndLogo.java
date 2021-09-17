package learntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TitleAndLogo {
	WebDriver driver;
	
	@BeforeMethod
	public void startapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); //configure chrome driver
        driver = new ChromeDriver(); 
		driver.get("https://www.google.com/");
		driver.manage().window().maximize(); 
		System.out.println("Open google.com");
	}
	
	@Test()
	public void checkTitle() {
		System.out.println("Check title");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "google"); //expected result comparing with actual
	}
	
	@Test(priority=1)
	public void checkLogo() {
		System.out.println("Check logo");
		boolean view = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(view); //expected result
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	//execution flow-->before method, Test1, aftermethod, beforemethod, test2, after method
}
