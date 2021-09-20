package seleniumdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver(); 
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //if element is found it will immediately stop waiting. works for all elements below
	
		driver.findElement(By.id("Email")).sendKeys("jennifer1998@gmail.com"); // To find email element and enter email, sendKeys to enter any value
		driver.findElement(By.name("Password")).sendKeys("pass123$"); // To find password element and enter password
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		WebDriverWait myWait = new WebDriverWait(driver, 10);
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log out")));//explicit wait, example when logout element is not found.
		
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}

}
