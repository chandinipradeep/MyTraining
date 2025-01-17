package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SampleAnnotation {
  
	@Test
  public void testCase1() 
  {
	  System.out.println("Test case1 executed");
  }
  
  @Test
  public void testCase2() {
	  System.out.println("Test case2 executed");
  }
  
  @Test
  public void testCase3() {
	  System.out.println("Test case3 executed");
  }
  
  @Test
  public void testCase4() {
	  System.out.println("Test case4 executed");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before method executed");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After method executed");
  }
  
  //Annotation-->its a pre and post condition statements..annotations used to do some operation before and after executing test cases
  //before and after each test cases the beforeMethod and afterMethod will execute
  //beforeMethod will perform before every test cases 
  //afterMethod will perform after every test cases
  //inside a class there will be only one beforeMethoad and afterMethod

}

