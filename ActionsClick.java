package sessionsselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		By content = By.xpath("//a[@class='menulink']");
		
		Actions act=new  Actions(driver);
		
		By linkText = By.linkText("COURSES");
		
		
	   act.moveToElement(driver.findElement(content)).build().perform();
	   
	   Thread.sleep(5000);
	   
	   driver.findElement(linkText).click();
	   
	   
	   
	  //act.moveToElement(driver.findElement(linkText)).click().build().perform();
	   
	   
	}

}
