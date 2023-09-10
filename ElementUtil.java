package seleniumpractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver)

	{
		this.driver = driver;

	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public WebElement getElement(By locator, int timeOut) {

		return waitForElementVisible(locator, timeOut);

	}

	public List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator)

	{

		getElement(locator).click();
	}

	public void doGetText(By locator)

	{
		getElement(locator).getText();

	}

	public boolean doElementIsDisplayed(By locator)

	{

		return getElement(locator).isDisplayed();
	}

	public String doGetElementAttribute(By locator, String attributeName)

	{

		return getElement(locator).getAttribute(attributeName);
	}

	public void doGetElementAttributes(By locator, String attributeName) {
		List<WebElement> elementsList = getElements(locator);

		for (WebElement e : elementsList) {
			String attributeVal = e.getAttribute(attributeName);
			System.out.println(attributeVal);

		}

	}

	public int getElementsCount(By locator)

	{
		List<WebElement> elementsList = getElements(locator);

		return elementsList.size();

	}

	public List<String> getElementsTextList(By locator)

	{
		List<WebElement> elementsList = getElements(locator);

		List<String> elementTextList = new ArrayList<String>();

		for (WebElement e : elementsList) {

			String text = e.getText();

			elementTextList.add(text);
		}

		return elementTextList;

	}

	// *****************************************************************************

	// Select Utilities

	// ****************************************************************************

	public void doSelectByIndex(By locator, int index) {

		Select select = new Select(getElement(locator));

		select.selectByIndex(index);

	}

	public void doSelectByValue(By locator, String value) {

		Select select = new Select(getElement(locator));

		select.selectByValue(value);

	}

	public void doSelectByVisibleText(By locator, String text) {

		Select select = new Select(getElement(locator));

		select.selectByVisibleText(text);

	}

	public void doSelectGetOptions(By locator, String value)

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

	public int doSelectGetOptionsCount(By locator)

	{

		Select select = new Select(getElement(locator));

		List<WebElement> optionsList = select.getOptions();

		return optionsList.size();

	}

	public List<String> doSelectGetOptionsTextList(By locator)

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

	public void doGetOptionsWithoutSelect(By locator, String value)

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

	// ********************************wait utils
	// ************************************

	public WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	public WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public Alert waitForAlertPresent(int timeOut)

	{

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		return wait.until(ExpectedConditions.alertIsPresent());

	}

	public String getAlertText(int timeOut) {
		return waitForAlertPresent(timeOut).getText();
	}

	public void acceptAlert(int timeOut) {

		waitForAlertPresent(timeOut).accept();
	}

	public void dismissAlert(int timeOut) {

		waitForAlertPresent(timeOut).dismiss();
	}

	public void alertSendKeys(int timeOut, String value) {
		waitForAlertPresent(timeOut).sendKeys(value);
	}

	public String waitForTitleContainsAndFetch(int timeOut, String titleFractionValue)

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.titleContains(titleFractionValue));
		return driver.getTitle();

	}

	public String waitForTitleIsAndFetch(int timeOut, String titleValue)

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();

	}

	public String waitForURLContainsAndFetch(int timeOut, String urlFractionValue)

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		wait.until(ExpectedConditions.urlContains(urlFractionValue));
		return driver.getTitle();

	}

	public Boolean waitForURLContains(int timeOut, String urlFractionValue)

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		return wait.until(ExpectedConditions.urlContains(urlFractionValue));

	}

	public Boolean waitForURLIsAndFetch(int timeOut, String urlValue)

	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		return wait.until(ExpectedConditions.urlToBe(urlValue));

	}

	public List<WebElement> waitForElementsPresent(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}

	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}

}