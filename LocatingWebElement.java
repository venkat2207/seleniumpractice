package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		
		driver=new ChromeDriver();
		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		
		//1 st approach
		
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("Venkat");
		 * 
		 * driver.findElement(By.id("input-password")).sendKeys("Test@123");
		 */
		
		//2nd approach
		
		/*
		 * WebElement inputEmail = driver.findElement(By.id("input-email"));
		 * 
		 * WebElement inputPassword = driver.findElement(By.id("input-password"));
		 * 
		 * 
		 * inputEmail.sendKeys("Venkat");
		 * 
		 * inputPassword.sendKeys("test@123");
		 */
		
		/*
		 * //3rd approach
		 * 
		 * By email = By.id("input-email");
		 * 
		 * By password = By.id("input-password");
		 * 
		 * 
		 * 
		 * WebElement findPwd = driver.findElement(password);
		 * 
		 * 
		 * WebElement findEmail = driver.findElement(email);
		 * 
		 * 
		 * findPwd.sendKeys("test@123");
		 * 
		 * findEmail.sendKeys("Venkat");
		 */
		
		
		//4th approach

		
		By email = By.id("input-email");
		
		By password = By.id("input-password");
		
		
		
		/*
		 * getElement(email).sendKeys("Venkat");
		 * 
		 * getElement(password).sendKeys("test@123");
		 * 
		 */
		
		
		doSendKeys(email,"venkat");
		
		doSendKeys(password,"test@123");
		
		
		

	}
	
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
		
	}
	
	
	public static void doSendKeys( By locator,String value)
	{
		
		getElement(locator).sendKeys(value);
	}
	
	

}
