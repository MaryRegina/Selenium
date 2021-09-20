package seleniumdemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='radiooptions' and @value='FeMale']")).click(); //xpath using and when there is no 1 unique identifier
		
		WebElement year = driver.findElement(By.xpath("//*[@placeholder='Year']"));
	    Select yr = new Select(year);
	    List<WebElement>yearOptions=yr.getOptions();
	    System.out.println(yearOptions.size());
	    for(int i = 0; i<yearOptions.size(); i++) {
	    	 System.out.println(yearOptions.get(i).getText());
	    }
	    yr.selectByIndex(5);
	    System.out.println("\n");
	    
		WebElement month = driver.findElement(By.xpath("//*[@placeholder='Month']"));
		Select mm = new Select(month);
		List<WebElement> monthOptions = mm.getOptions();
		System.out.println(monthOptions.size());
		for (int i = 0; i < monthOptions.size(); i++) {
			System.out.println(monthOptions.get(i).getText());
		}
		mm.selectByValue("March");
		System.out.println("\n");
		
		WebElement day = driver.findElement(By.xpath("//*[@placeholder='Day']"));
		Select dd = new Select(day);
		List<WebElement> dayOptions = dd.getOptions();
		System.out.println(dayOptions.size());
		for (int i = 0; i < dayOptions.size(); i++) {
			System.out.println(dayOptions.get(i).getText());
		}
		dd.selectByVisibleText("28");

	}

}
