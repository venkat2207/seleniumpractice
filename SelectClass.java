package sessionsselenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

		By country = By.id("Form_getForm_Country");

		By countryDropDown = By.xpath("//select[@id='Form_getForm_Country']/option");

		WebElement countryElement = driver.findElement(country);

		Select select = new Select(countryElement);

		// doSelectGetOptions(country, "Sweden");

		// int getOptionsCount = doSelectGetOptionsCount(country);

		// System.out.println(getOptionsCount);

		/*
		 * List<String> doSelectGetOptionsTextList =
		 * doSelectGetOptionsTextList(country);
		 * 
		 * for (String e : doSelectGetOptionsTextList)
		 * 
		 * {
		 * 
		 * System.out.println(e);
		 * 
		 * }
		 */

		// doClick(By locator)

		doGetOptionsWithoutSelect(countryDropDown, "Austria");

		/*
		 * select.selectByIndex(1); Thread.sleep(3000);
		 * 
		 * select.selectByVisibleText("Denmark");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * select.selectByValue("Finland");
		 */

		/*
		 * doSelectByIndex(country,2);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * doSelectByValue(country,"India");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * doSelectByVisibleText(country, "Spain");
		 */

	}

	public static WebElement getElement(By locator)

	{
		return driver.findElement(locator);

	}

	public static List<WebElement> getElements(By locator)

	{
		return driver.findElements(locator);

	}

	public static void doSelectByIndex(By locator, int index) {

		Select select = new Select(getElement(locator));

		select.selectByIndex(index);

	}

	public static void doSelectByValue(By locator, String value) {

		Select select = new Select(getElement(locator));

		select.selectByValue(value);

	}

	public static void doSelectByVisibleText(By locator, String text) {

		Select select = new Select(getElement(locator));

		select.selectByVisibleText(text);

	}

	public static void doSelectGetOptions(By locator, String value)

	{

		Select select = new Select(getElement(locator));

		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();

			if (text.contains(value))

			{

				e.click();
				break;
			}
		}

	}

	public static int doSelectGetOptionsCount(By locator)

	{

		Select select = new Select(getElement(locator));

		List<WebElement> optionsList = select.getOptions();

		return optionsList.size();

	}

	public static List<String> doSelectGetOptionsTextList(By locator)

	{

		Select select = new Select(getElement(locator));

		List<WebElement> optionsList = select.getOptions();

		List<String> optionsTextList = new ArrayList<String>();

		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);

		}

		return optionsTextList;

	}

	public static void doClick(By locator)

	{

		getElement(locator).click();
	}

	public static void doGetOptionsWithoutSelect(By locator, String value)

	{

		List<WebElement> elements = getElements(locator);

		for (WebElement e : elements) {

			String text = e.getText();

			if (text.contains(value))

			{

				e.click();
				break;

			}
		}

	}

}
