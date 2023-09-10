package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationClass {

	public static void main(String[] args) {
		
		

	    By firstName = By.id("input-firstname");
		
		By lastName = By.id("input-lastname");
		
		By email=By.id("input-email");
		
		By phone=By.id("input-telephone");
		
		By password=By.id("input-password");
		
		By confirmPassword=By.id("input-confirm");
		
		By agree=By.name("agree");
		
		By continueBtn= By.xpath("//input[@value='Continue']");
		
		
		
		
        // doSendKeys(email,"venkat");
		
		// doSendKeys(password,"test@123");	
		
		
		BrowserUtil brUtil=new BrowserUtil();
		
		WebDriver driver = brUtil.initDriver("chrome");
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		ElementUtil eleUtil=new ElementUtil(driver);
		
		eleUtil.doSendKeys(firstName, "venkat");
		
		eleUtil.doSendKeys(lastName, "Bala");		
		
		eleUtil.doSendKeys(phone, "790454");
		
		eleUtil.doSendKeys(email, "testing@123.com");
		
		eleUtil.doSendKeys(password, "test");
				
		eleUtil.doSendKeys(confirmPassword, "test");
		
		
		eleUtil.doClick(agree);
		
		eleUtil.doClick(continueBtn);
		
		
		
		

		
		

	}

}
