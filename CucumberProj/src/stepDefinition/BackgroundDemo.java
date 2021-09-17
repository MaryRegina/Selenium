package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BackgroundDemo {
	
	WebDriver driver;
	@Given("^Iam on the home page of demowebshop$")
	public void iam_on_the_home_page_of_demowebshop() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
	}

	@Then("^I should see that title contain \"([^\"]*)\"$")
	public void i_should_see_that_title_contain(String arg1) throws Throwable {
		assert driver.getTitle().contains("Shop");
		driver.close();
	}

	@Then("^I should see that source contains \"([^\"]*)\"$")
	public void i_should_see_that_source_contains(String arg1) throws Throwable {
		assert driver.getPageSource().contains("shop");
		driver.close();
	   
	}


}
