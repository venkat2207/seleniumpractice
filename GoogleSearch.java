package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	     
		

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		By name = By.name("q");

		
		driver.findElement(name).sendKeys("Naveen");
		
		Thread.sleep(3000);
		
		
		
		
		

	}

}
