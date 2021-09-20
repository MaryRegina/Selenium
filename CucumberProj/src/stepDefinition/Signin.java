package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signin {
	WebDriver driver;
	@Given("^user in on login page$")
	public void user_in_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe"); 
        driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize();
	}

	@When("^user enters email and password and click login button$")
	public void user_enters_emial_and_password_and_click_login_button() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("jennifer1998@gmail.com"); // To find email element and enter email, sendKeys to enter any value
		driver.findElement(By.name("Password")).sendKeys("pass123$"); // To find password element and enter password
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@Then("^user should see logout link$")
	public void user_should_see_logout_link() throws Throwable {
		boolean view = driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}
	
}
