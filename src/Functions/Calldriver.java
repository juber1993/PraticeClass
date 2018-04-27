package Functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Calldriver extends Initialize
{
	public void callDriver()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
	}

}
