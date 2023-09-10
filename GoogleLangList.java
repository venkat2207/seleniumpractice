package sessionsselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLangList {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		
		
		By id = By.xpath("//div[@id='SIvCob']/a");
		
		
		List<WebElement> findElements = driver.findElements(id);		

		
		
		for (WebElement e :findElements)
			
		{
			
			String text = e.getText();
			
			System.out.println(text);
			
		}
		
		

	}

}
