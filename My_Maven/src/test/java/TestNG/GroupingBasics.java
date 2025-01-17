package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class GroupingBasics {

	@Test
	public void testCase1() {
		System.out.println("Test case 1 executed");
	}

	@Test(groups = "Critical")
	public void testCase2() {
		System.out.println("Test case 2 executed");
	}

	@Test(groups = "Low")
	public void testCase3() {
		System.out.println("Test case 3 executed");
	}

	@Test(groups = "Critical")
	public void testCase4() {
		System.out.println("Test case 4 executed");
	}

	@Test
	public void testCase5() {
		System.out.println("Test case 5 executed");
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		System.out.println("Before method executed");
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() {
		System.out.println("After method executed");
	}

}
