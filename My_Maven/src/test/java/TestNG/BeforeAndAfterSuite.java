package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BeforeAndAfterSuite {
  @Test
  public void testCase1() {
	  System.out.println("Testcase 1 executed");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite executed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite executed");
  }

}
