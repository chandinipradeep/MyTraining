package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BeforeClassAndAfterClass {
  @Test
  public void testCase1() {
	  System.out.println("Test case 1 executed");
  }
  @Test
  public void testCase2() {
	  System.out.println("Test case 2 executed");
  }
  
  @Test
  public void testCase3() {
	  System.out.println("Test case 3 executed");
  }
  
  @Test
  public void testCase4() {
	  System.out.println("Test case 4 executed");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class executed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class executed");
  }

}
