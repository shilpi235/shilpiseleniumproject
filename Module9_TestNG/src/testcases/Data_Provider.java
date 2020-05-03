package testcases;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@DataProvider (name="sampleTest")
	public static Object[][] xyzData(Method m)
	{
		Object data[][]=null;
		
		if(m.getName().equals("TestA"))
		{
			data=new Object[2][2];
			
			data[0][0]="U1";
			data[0][1]="P1";
			
			data[1][0]="U2";
			data[1][1]="P2";
		}
		
		else if(m.getName().equals("TestB"))
		{
			data=new Object[2][3];
			data[0][0]="U1";
			data[0][1]="P1";
			data[0][2]="test@gmail.com";
			
			
			data[1][0]="U2";
			data[1][1]="P2";
			data[1][2]="test1@gmail.com";
		}
		return data;
	}

}
