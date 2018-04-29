package assignDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import driverInt.DriverInt;

public class AssignDriver extends DriverInt{
	String browser ="Ff";

	@BeforeTest
	public void setDrivers()	{
		if(browser.equalsIgnoreCase("ch")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			APPLICATION_LOGS.debug("Chrome Browser");
		}
		else if(browser.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			APPLICATION_LOGS.debug("Firefox Browser");

		}
		driver.get ("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
