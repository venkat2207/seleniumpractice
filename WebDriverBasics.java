package sessionsselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {
	
	


	public static void main(String[] args) {
		
		String browser="chrome";
		
		 WebDriver driver =null;
		
		
		if(browser.equals("chrome"))
			
		{
			driver=new ChromeDriver();
			
		}
		else if (browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			
		}
		
		else if (browser.equals("edge"))
		{
			
			driver=new EdgeDriver();
			
		}
		
		else 
		{
			System.out.println("please pass the right browser"+ browser);
			
		}
		
		
		
		
		// Open Browser
		
		
		//enter url
		
		driver.get("https://www.google.com/");
		
		//get title
		
		
		
		
		
		
		
		String title = driver.getTitle().toLowerCase();
		
		if(title.contains("google"))
		
		{
			System.out.println("pass");
			
		}	
	
		else
		{
			System.out.println("fail");
		}
			
			
		driver.quit();
		
		
		

	}

}
