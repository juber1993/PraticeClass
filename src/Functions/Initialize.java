package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Initialize {
	protected WebDriver driver;

	public void typeByXpath(String XpathLocators, String Values)	{
		driver.findElement(By.xpath(XpathLocators)).sendKeys(Values);
	}


}
