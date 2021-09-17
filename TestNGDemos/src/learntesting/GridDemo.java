package learntesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridDemo {
	WebDriver driver;
	@Test
	public void login() throws MalformedURLException {
		
	DesiredCapabilities cpt=DesiredCapabilities.chrome();
	cpt.setBrowserName("chrome");
	cpt.setPlatform(Platform.WINDOWS);
	
	driver = new RemoteWebDriver(new URL("http://192.168.43.159:4355/wd/hub"),cpt);
	
	
	driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize(); 
	
	driver.findElement(By.id("Email")).sendKeys("jennifer1998@gmail.com"); 
	driver.findElement(By.name("Password")).sendKeys("pass123$"); 
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	System.out.println("Login Successsful");
	driver.findElement(By.linkText("Log out")).click();
	driver.close();
	
	}

}
