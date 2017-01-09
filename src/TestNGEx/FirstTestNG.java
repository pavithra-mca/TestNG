package TestNGEx;

import org.testng.Reporter;
import org.testng.annotations.*;
public class FirstTestNG {
	
	@BeforeClass
	public void setup()
	{
		Reporter.log("hi");
		System.out.println("In setup");
	}
	
	@Test
	public void first(){
		Reporter.log("In test",true);
		System.out.println("Hello");
	}
	@AfterClass
	public void teardown(){
		Reporter.log("In tear down");
		System.out.println("In Afterclass");
		System.out.println("Hellotest");
		System.out.println("Hello");
		
	}

}
