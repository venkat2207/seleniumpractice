package sessionsselenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumberOfImages {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		List<WebElement> linksList = driver.findElements(By.tagName("img"));

		int size = linksList.size();

		System.out.println(size);

		ArrayList<String> linksText = new ArrayList<String>();
		int index = 0;

		for (WebElement e : linksList)

		{

			String text = e.getText();

			if (text.length() > 0)

			{
				linksText.add(text);
				System.out.println(text);

			}

			if (text.length() == 0) {

				index++;
			}

		}

		System.out.println(linksText.size());

		System.out.println(index);

	}

}
