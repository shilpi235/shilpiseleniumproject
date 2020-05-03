package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {

	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("close the browser");
	}
	
	@Test(dataProvider="getData")
	//@Test(dataProviderClass=Data_Provider.class,dataProvider="regtest")
	public void doLogin(String username,String password,String exRes,String browser,int phone)
	{
		//parameters should be same as columns and same data type
		System.out.println("in do login test");
	}
	
	//@DataProvider(name="regtest",parallel=true)   //to run test data paralellely, suite.xml is used
	//when you wnat to run tests paralleluy like for grid
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][5];
		
		data[0][0] = "U1";
		data[0][1] = "P1";
		data[0][2] = "Pass";
		data[0][3] = "Mozilla";
		data[0][4]=68687;
		
		data[1][0] = "U1";
		data[1][1] = "P1";
		data[1][2] = "Pass";
		data[1][3] = "Mozilla";
		data[1][4]=68687;
		
		data[2][0] = "U1";
		data[2][1] = "P1";
		data[2][2] = "Pass";
		data[2][3] = "Mozilla";
		data[2][4]=68687;
		
		return data;
		
		//Apache ant is build and compile tool which helps to run java files
		//take zip from apache ant and unzip it, take its path and add it under system variables ANT_HOME under advanced setting
		//and edit "path and put semicolon at end copy path/bin
		
		//open cmd and type ant
	}
}
