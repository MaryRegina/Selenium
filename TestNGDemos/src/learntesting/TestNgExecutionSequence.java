package learntesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgExecutionSequence {
	@BeforeSuite
	public void setproperty() {
		System.out.println("Set the system property");
	}
	
	@BeforeClass
	public void enterurl() {
		System.out.println("Open URL");
	}
	
	@BeforeTest
	public void launchbrowser() {
		System.out.println("Open browser");
	}
	
	@BeforeMethod
	public void geturl() {
		System.out.println("Display URL");
	}
	
	@Test
	public void checktitle() {
		System.out.println("Check title of page");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	
	@AfterClass
	public void closebrowser() {
		System.out.println("Close browser");
	}
	
	@AfterTest
	public void checkresult() {
		System.out.println("Result displayed");
	}

}
