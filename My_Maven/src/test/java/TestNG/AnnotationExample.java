package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class AnnotationExample {
	
	WebDriver driver;
	
  @Test
  public void verifyLoginFeatureIsWorkingWithValidUser() 
  {
	  
	    WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		
		//assertion--> to compare the actual result and expected result
		
		WebElement welcomtext=driver.findElement(By.xpath("//p[text()='Welcome to Payroll Application']"));
		String actualresult=welcomtext.getText();
		String expectedresult="Welcome to Payroll Application 11";
		//Assert.assertEquals(actualresult, expectedresult, "Login feature is not working as expected");
		//System.out.println("********************************");
		
		//soft assertion
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals(actualresult, expectedresult, "Not working as expected");
		System.out.println("****************************************");
		softassert.assertAll(); //mandatory. otherwise it will show the testcase as passed.
		
  }
  
  @Test(enabled = false)//to hide test case
  public void verifyTheTextOfClientPageSearchButton()
  {
	  
	    WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		
		WebElement clienttab=driver.findElement(By.xpath("//a[text()='Clients']"));
		clienttab.click();
		
		WebElement searchbutton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		String searchbuttontext=searchbutton.getText();
		
		String actualtext=searchbuttontext;
		String expectedtext="Search";
		
		Assert.assertEquals(actualtext, expectedtext, "Not working as expected");
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.qabible.in/payrollapp/site/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
  }

  @AfterMethod
  public void afterMethod() 
  {
	 driver.close();
  }

}

//2 types of assertion
//1.Hard  --> once an assertion is failed, remaining code will not execute
//2.soft -->execution will not terminate even if the test case is failed.
