package driverInt;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DriverInt{
	public static Logger APPLICATION_LOGS =Logger.getLogger("devpinoyLogger");
	protected WebDriver driver;

	public void typeByXpath(String XpathLocators, String Values)	{
		driver.findElement(By.xpath(XpathLocators)).sendKeys(Values);
	}


}
