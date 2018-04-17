package assignDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import driverInt.DriverInt;

public class AssignDriver extends DriverInt
{
	@BeforeTest
	
	public void setDrivers()
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get ("http://facebook.com");
}
}
