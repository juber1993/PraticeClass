package driverInt;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class DriverInt{
	//public static Logger APPLICATION_LOGS =Logger.getLogger("devpinoyLogger");
	
	// This code is to call the Log4j files like reference of class
	public static Logger APPLICATION_LOGS =Logger.getLogger("devinoyLogger");
	
	
	protected WebDriver driver;

	public void typeByXpath(String XpathLocators, String Values)	{
		driver.findElement(By.xpath(XpathLocators)).sendKeys(Values);
	}


}
