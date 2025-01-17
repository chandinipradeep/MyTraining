package TestNG;

import org.testng.annotations.Test;

public class Priority {
	
  @Test(priority = 1)
  public void testCase1() 
  {
	  System.out.println("Test case 1 executed");
  }
  
  @Test
  public void testCase2()
  {
	  System.out.println("Test case 2 executed");
  }
  
  @Test(priority = 2)
  public void testCase3()
  {
	  System.out.println("Test case 3 executed");
  }
  
  @Test(priority = 4)
  public void testCase4()
  {
	  System.out.println("Test case 4 executed");
  }
  
  @Test
  public void testCase5()
  {
	 System.out.println("Test case 5 executed");
  }
}
