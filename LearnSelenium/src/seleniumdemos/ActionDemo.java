package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {
	
	public static void main(String args[]) {
		
	WebDriver driver;
    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver(); 
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("q")).sendKeys("Selenium");
	
	Actions action = new Actions(driver);
	action.sendKeys(Keys.ENTER).perform();
}
	
}
