package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BeforeTestAndAfterTest {
  @Test
  public void testCase1() {
	  System.out.println("Test case 1 executed");
  }
  
  @Test
  public void testCase2()
  {
	  System.out.println("Test case 2 executed");
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test executed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test executed");
  }

}
