package mainPackage;

import org.testng.annotations.Test;

import assignDriver.AssignDriver;
import values.Values;
import xPathLocators.XpathLocators;

public class mainClass extends AssignDriver{

	XpathLocators  loc= new XpathLocators ();
	Values val= new Values();

	@Test
	public void testingFramework(){
		typeByXpath(loc.emailxpath, val.Email);
		typeByXpath(loc.idxpath, val.Pass );
	}


}
