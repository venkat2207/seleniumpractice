package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {

	public static void main(String[] args) {

		String browser = "chrome";

		WebDriver driver = null;

		switch (browser) {
		case "chrome":

			driver = new ChromeDriver();

			break;

		case "edge":

			driver = new EdgeDriver();

			break;

		case "Firefox":

			driver = new FirefoxDriver();

			break;

		default:
			System.out.println("please pass the right browser" + browser);
			break;
		}
		
		
		driver.get("https://www.amazon.com/");

		String title = driver.getTitle().toLowerCase();

		if (title.contains("amazon"))

		{
			System.out.println("pass");

		}

		else {
			System.out.println("fail");
		}

		driver.quit();

	}

}
