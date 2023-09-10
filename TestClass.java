package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestClass {

	public static void main(String[] args) {
		
		
	    By email = By.id("input-email");
		
		By password = By.id("input-password");
		
		
        // doSendKeys(email,"venkat");
		
		// doSendKeys(password,"test@123");	
		
		
		BrowserUtil brUtil=new BrowserUtil();
		
		WebDriver driver = brUtil.initDriver("chrome");
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		eleUtil.doSendKeys(password, "test@123");
		
		eleUtil.doSendKeys(email, "venkat");
		
		
		
		

	}

}
