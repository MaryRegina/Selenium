package learntesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	
	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); //configure chrome driver
		driver = new ChromeDriver();  
		driver.get("http://demowebshop.tricentis.com/");
		driver.quit();
	}
	
	@Test
	public void test2() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); //configure chrome driver
		driver = new ChromeDriver();  
		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "google");
		driver.quit();
	}

}
