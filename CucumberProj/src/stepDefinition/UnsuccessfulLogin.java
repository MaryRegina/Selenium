package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UnsuccessfulLogin {
	WebDriver driver;
	@Given("^user in on webshoplogin page$")
	public void user_in_on_webshoplogin_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); 
        driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize();
	}

	@When("^user types email and password and clicks login button$")
	public void user_types_email_and_password_and_clicks_login_button() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("jennifer1998@gmail.com"); // To find email element and enter email, sendKeys to enter any value
		driver.findElement(By.name("Password")).sendKeys("pass$"); // To find password element and enter password
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^user should get error message as Invalid Credentials$")
	public void user_should_get_error_message() throws Throwable {
	    String errorMsg = driver.findElement(By.xpath("//*[contains(text(),'Login was unsuccessful') ]")).getText();
		Assert.assertEquals("Invalid Credentials", errorMsg);
	    driver.close();
	}
	
	//Test will fail. Its a defect


}
