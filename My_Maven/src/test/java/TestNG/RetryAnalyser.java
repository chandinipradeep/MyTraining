package TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RetryAnalyser implements IRetryAnalyzer  {
	
	int counter = 0;
	int retryLimit = 3;

public boolean retry(ITestResult result) {

		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		return false;
	}

@DataProvider(name = "data-provider") //defining data provider
public Object[][] dpMethod() {
	return new Object[][] { { 2, 3, 5 }, { 5, 7, 9 } ,{1,2,3}}; //2D array
}
}