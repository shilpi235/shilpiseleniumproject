package testcases;

import org.testng.annotations.Test;

public class TestCases {
	
	@Test(priority=1,dataProviderClass=Data_Provider.class,dataProvider="sampleTest")
	public void TestA(String u, String p)
	{
		
	}
	
	@Test(priority=2,dataProviderClass=Data_Provider.class,dataProvider="sampleTest")
	public void TestB(String u, String p,String email)
	{
		
	}
	

}
