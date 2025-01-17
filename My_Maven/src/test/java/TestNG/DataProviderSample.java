package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample {

//	@DataProvider(name = "data-provider") //defining data provider
//	public Object[][] dpMethod() {
//		return new Object[][] { { 2, 3, 5 }, { 5, 7, 9 } ,{1,2,3}}; //2D array
//	}

	@Test(dataProvider = "data-provider",dataProviderClass = RetryAnalyser.class) //linking data provider to the test case
	public void testCase1(int a,int b,int c) {
		System.out.println(a+b+c);
	}
}

//Data provider
