package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DashboardTestCases {
	
	WebDriver driver;
	
	
  @Test
  public void f() {
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver=new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/site/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
  }

  @AfterMethod
  public void afterMethod() {
  }

}
