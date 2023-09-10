package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver;

	public WebDriver initDriver(String browserName)

	{

		switch (browserName) {
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
			System.out.println("please pass the right browser" + browserName);
			break;
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();

		return driver;

	}

	public void launchUrl(String url)

	{

		if (url == null) {

			System.out.println("please enter valid url");

		}

		if (url.indexOf("http") == 0) {

			driver.get(url);
		}

	}

	public String getPageTitle()

	{

		String title = driver.getTitle();

		return title;

	}

	public void getPageUrl() {

		driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();

	}

	public void quitBrowser() {

		driver.quit();
	}

}
