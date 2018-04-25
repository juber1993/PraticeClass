package assignDriver;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import driverInt.DriverInt;

public class AssignDriver extends DriverInt{

	@BeforeTest
	public void setDrivers()	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get ("http://facebook.com");
	}
}
