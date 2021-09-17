package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePom {
	WebDriver driver;
	
	By email=By.id("Email");
	By password=By.name("Password");
    By login= By.xpath("//input[@value='Log in']");
    
    public LoginPagePom(WebDriver driver) {
    	this.driver=driver;  	
    }
    
    public void enterEmail(String mail) {
    	driver.findElement(email).sendKeys(mail);	
    }
    
    public void enterPassword(String pwd) {
    	driver.findElement(password).sendKeys(pwd);	
    }
    
    public void clickLogin() {
    	driver.findElement(login).click();
    }
    
}
