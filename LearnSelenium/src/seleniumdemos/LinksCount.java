package seleniumdemos;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinksCount {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); //configure chrome driver
		driver = new ChromeDriver();  
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
	    System.out.println("Number of links:"+links.size());
	    for(int i=0;i<links.size();i++) {
	    	 System.out.println(links.get(i).getText()+"  "+links.get(i).getAttribute("href"));
	    }
	    driver.close();
	}

}
