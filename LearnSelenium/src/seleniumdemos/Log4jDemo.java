package seleniumdemos;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {

	public static void main(String[] args) {

		Logger log = Logger.getLogger(Log4jDemo.class);
		PropertyConfigurator.configure("log4j.properties");

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); 																							// chrome																											// driver
		WebDriver driver = new ChromeDriver();

		log.info("Launch Browser");

		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();

		log.info("Opened application");

		String expectedTitle = "Demo Web Shop. Login";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);

		log.info("Title value is:" + actualTitle);

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("You are on correct page");
			log.info("correct title");
			driver.findElement(By.id("Email")).sendKeys("jennifer1998@gmail.com"); 																																
			driver.findElement(By.name("Password")).sendKeys("pass123$"); 
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			driver.findElement(By.linkText("Log out")).click();
			driver.close();
		} else {
			System.out.println("You are on wrong page");
			log.error("Wrong title");
			driver.close();
		}
	}

}
