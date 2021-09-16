package seleniumdemos;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click(); //simple alert button
		Alert simpleAlert = driver.switchTo().alert(); //Cannot inspect javascript alert so use Alert class
		String simpleAlertMsg = driver.switchTo().alert().getText(); 
        System.out.println(simpleAlertMsg);
        simpleAlert.accept();
        System.out.println("\n");
        
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click(); 
        Alert confirmationAlert = driver.switchTo().alert(); 
		String confirmationAlertMsg = driver.switchTo().alert().getText(); 
        System.out.println(confirmationAlertMsg);
        confirmationAlert.dismiss();
        String conAlertResult = driver.findElement(By.id("demo")).getText();
        System.out.println(conAlertResult);
        System.out.println("\n");
        
        driver.findElement(By.linkText("Alert with Textbox")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click(); 
        Alert promptAlert = driver.switchTo().alert(); 
		String promptAlertMsg = driver.switchTo().alert().getText(); 
		System.out.println(promptAlertMsg);
		promptAlert.sendKeys("Mary Jeniffer");
		promptAlert.accept();
		String promptAlertResult = driver.findElement(By.id("demo1")).getText();
        System.out.println(promptAlertResult);
        System.out.println("\n");
        
	}

}
