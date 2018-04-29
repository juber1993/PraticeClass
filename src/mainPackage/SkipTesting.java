package mainPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

import assignDriver.AssignDriver;

public class SkipTesting extends AssignDriver{
	public void goingToSkipThis() {
		System.out.println("I am going to skip this test");
		APPLICATION_LOGS.debug("This TC is going to skip");
		throw new SkipException ("Skipping because this tc is no longer needed");
	}

	@Test
	public void disableTest() {
		System.out.println("I am not going to skip test");
	}
	
	@Test
	public void disable2Test() {
		System.out.println("I am not going to skip test");
	}
}
