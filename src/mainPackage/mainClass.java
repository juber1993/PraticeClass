package mainPackage;

import org.testng.annotations.Test;

import assignDriver.AssignDriver;
import values.Values;
import xPathLocators.XpathLocators;

@Test

public class mainClass extends AssignDriver{

	//APPLICATION_LOGS.debug("My TEST Started");



	XpathLocators  loc= new XpathLocators ();
	Values val= new Values();

//	@Test
	public void testingFramework(){

		APPLICATION_LOGS.debug("My Test Started");
		typeByXpath(loc.emailxpath, val.Email);
		typeByXpath(loc.idxpath, val.Pass );

		APPLICATION_LOGS.debug("My TEST Ended");
	}



}
