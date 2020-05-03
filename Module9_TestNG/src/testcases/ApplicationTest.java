package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ApplicationTest {

	SoftAssert softAssert = null;
	@Test(priority=1)
	public void doLogin()
	{
		//throw new SkipException("reason to skip this function");
		softAssert = new SoftAssert();
		softAssert.fail("Error message");
		System.out.println("Login Test");
		//code
		softAssert.assertAll();
	}
	
	@Test(priority=2,dependsOnMethods= {"doLogin"})
	public void logout()
	{
		softAssert = new SoftAssert();
		System.out.println("Logout Test");
		softAssert.assertEquals("A", "C");
		softAssert.assertAll();
	}
	
	@BeforeTest
	public void beforeallTest() {
		System.out.println("before all tests this will run");
	}
	
	@AfterTest
	public void afterallTest() {
		System.out.println("after all tests this will run");
	}
	
	@BeforeMethod
	public void beforeeachmethod()
	{
		System.out.println("will run before each method");
	}
	
	@AfterMethod
	public void aftereachmethod()
	{
		System.out.println("will run before each method");
	}
	
	//there is beforeclass and after class as well , there is after suite and before suite as well
	//if priority is not given then they will run alphabetically
	//if func is skipped then all functions dependent on that will be skipped
	
	public void doRegisterTest() {
		String expectedTitle="xxx";
		String actualTitle="yyyy";
		
		softAssert.assertEquals(actualTitle, expectedTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(2>1,"error message");
		//Assert.assertTrue(isElementPresent("xxx"),"error message if element nt present");
		
		softAssert.assertAll();
	}
}
