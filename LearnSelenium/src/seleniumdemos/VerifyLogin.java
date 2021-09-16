package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); //configure chrome driver
        WebDriver driver = new ChromeDriver(); //interface 
		driver.get("http://demowebshop.tricentis.com/login"); //opening the url in chrome driver
		driver.manage().window().maximize(); //To maximize chrome window
		
		String expectedTitle="Demo Web Shop. Login";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("You are on correct page");
			driver.findElement(By.id("Email")).sendKeys("jennifer1998@gmail.com"); // To find email element and enter email, sendKeys to enter any value
			driver.findElement(By.name("Password")).sendKeys("pass123$"); // To find password element and enter password
			// driver.findElement(By.className("button-1 login-button")).click(); // class name locator not able to locate the element
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			// driver.findElement(By.xpath("//a[@href='/logout']")).click(); //using xpath
			driver.findElement(By.linkText("Log out")).click();
			driver.close();
		} else {
			System.out.println("You are on wrong page");
			driver.close();
		}
	}

}
