package mainPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationPractice 
{
	@Test (priority =1)
	public void FirstTest()
	{
		System.out.println("This is our test");
	}
	@BeforeTest
	public void Before_Test()
	{
		System.out.println("This is before test");
	}

	@AfterTest 
	public void After_Test()
	{
		System.out.println("This is after test");
	}
	@BeforeSuite
	public void Before_Suite()
	{
		System.out.println("This will run before suite");
	}
	@AfterSuite
	public void After_Suit()
	{
		System.out.println("This will run after suite");
	}
	@BeforeMethod
	public void Before_Method()
	{
		System.out.println("This will run before method");
	}
	@AfterMethod
	public void After_Method()
	{
		System.out.println("This will run after method");
	}
	@BeforeClass
	public void Before_Class()
	{
		System.out.println("This will run before class");
	}
	@AfterClass
	public void After_Class()
	{
		System.out.println("This will run after class");
	}

}
