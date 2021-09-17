package learntesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityDemo {
	WebDriver driver;
	// if priority is not given it runs in alphabetical order
	@Test(priority = 0, description="Testcase to open demoshop")
	public void startapp() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); //configure chrome driver
        driver = new ChromeDriver(); 
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize(); 
		System.out.println("Start Application");
	}
	
	//@Test(priority = 1, description="Testcase to verify login")
	@Test(dependsOnMethods = "startapp", description="Testcase to verify login")
	public void loginapp() {
		driver.findElement(By.id("Email")).sendKeys("jennifer1998@gmail.com"); 
		driver.findElement(By.name("Password")).sendKeys("pass123$"); 
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		System.out.println("Login Successsful");
	}
	
	//@Test(priority = 2, description="Testcase to verify Signoff")
	@Test(dependsOnMethods = "loginapp", description="Testcase to verify Signoff")
	public void signoff() {
		boolean view = driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view); //To check if the user has logged in. //either email appears or logout button appears
		//Assert.assertFalse(view) //signoff test fails
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("Sign out");
	} 
	
	@Test(dependsOnMethods="signoff", alwaysRun=true) //irrespective of signoff is passed or failed, it is gng to close the window
	public void closebrowser() {
		driver.close();
	} 
	
	

}
