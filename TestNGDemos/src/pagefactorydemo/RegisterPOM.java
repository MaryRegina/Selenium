package pagefactorydemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPOM {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='gender-female']")
	WebElement female;
	
	@FindBy(xpath = "//input[@id='gender-male']")
	WebElement male;

	@FindBy(id = "FirstName")
	WebElement firstName;

	@FindBy(name= "LastName")
	WebElement lastName;
	
	@FindBy(id= "Email")
	WebElement email;
	
	@FindBy(xpath= "//input[@type='password']")
	WebElement password;
	
	@FindBy(name= "ConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id= "register-button")
	WebElement registerBtn;
	
	
	public RegisterPOM(WebDriver driver) {
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectGender() {
		female.click();
	}

	public void typeFirstName(String fn) {
        firstName.sendKeys(fn);	
	}
	
	public void typeLastName(String ln) {
        lastName.sendKeys(ln);	
	}
 
	public void typeEmail(String eml) {
         email.sendKeys(eml);	
	}
    
    public void typePassword(String pass) {
    	password.sendKeys(pass);
    }
    
    public void typeConPassword(String conPass) {
    	confirmPassword.sendKeys(conPass);
    }
    
    public void clickRegister() {
    	registerBtn.click();
    }

}
