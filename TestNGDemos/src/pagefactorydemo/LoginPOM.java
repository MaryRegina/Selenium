package pagefactorydemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM {
	WebDriver driver;
	@FindBy(name = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginBtn;

	public LoginPOM(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void typeEmail(String eml) {
         email.sendKeys(eml);	
	}
    
    public void typePassword(String pass) {
    	password.sendKeys(pass);
    }
    
    public void clickLogin() {
    	loginBtn.click();
    }

}
