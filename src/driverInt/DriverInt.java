package driverInt;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DriverInt



{
	protected WebDriver driver;

	public void typeByXpath(String locators, String Values)
	{
		driver.findElement(By.xpath(locators)).sendKeys(Values);
	}


}
