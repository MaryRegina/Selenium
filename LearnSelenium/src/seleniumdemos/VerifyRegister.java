package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegister {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver(); 
		driver.get("http://demowebshop.tricentis.com/register"); 
		driver.manage().window().maximize();
		
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Aishu"); 
		driver.findElement(By.id("LastName")).sendKeys("David"); 
		driver.findElement(By.id("Email")).sendKeys("aishunathan@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("aish1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("aish1234");
		driver.findElement(By.name("register-button")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
	
	
	
	

}
