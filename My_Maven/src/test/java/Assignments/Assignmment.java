package Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Assignmment {
	
	WebDriver driver;
	
//1. Open the application --> Click "Reset It" hyper link --> Verify the text of "Send" button.
	
  @Test(enabled = false)
  public void verifyTheTextOfResetLinkSendButton() 
  {
	  WebElement resetlink=driver.findElement(By.xpath("//a[text()='reset it']"));
	  resetlink.click();
	  
	  WebElement sendbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));

	  String actualresult=sendbutton.getText();
	  String expectedresult="Send";
	  
	  Assert.assertEquals(actualresult, expectedresult, "Not working as expected");
  }
  
  //2. Open the application --> Click "Reset It" hyper link --> Verify the font type of "Send" button text. 
  @Test(enabled = false)
  
  public void verifyFontTypeOfResetLinkSendButton()
  {
	  WebElement resetlink=driver.findElement(By.xpath("//a[text()='reset it']"));
	  resetlink.click();
	  WebElement sendbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
	  String actualresult=sendbutton.getCssValue("font-family");
	  String expectedresult="Overpass, sans-serif";
	  Assert.assertEquals(actualresult, expectedresult, "Not working as expected");
  }
  
  //3. Open the application --> Login to the application --> Navigate to "Client" menu --> verify the tooltip value for "Edit" icon for any row in the table.
  @Test(enabled = false)
  public void verifyToolTipValueOfEditIconInTableOfClientMenu()
  {
	    WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		WebElement clienttab=driver.findElement(By.xpath("//a[text()='Clients']"));
		clienttab.click();
		WebElement edittooltip=driver.findElement(By.xpath("//table[@class='table table-striped table-bordered']//tbody//tr[1]//a[2]"));
		String actualresult=edittooltip.getDomAttribute("title");
		String expectedresult="Update";
		Assert.assertEquals(actualresult, expectedresult, "Not working as expected");
		
  }
  
  //4. Open the application --> Login to the application --> Navigate to "Worker" menu --> Click "Create Worker" sub menu --> Select any value from the "Title" drop-down and verify the selected value.
  
  @Test(retryAnalyzer = TestNG.RetryAnalyser.class)
  public void verifySelectedValueOfTitleDropDownFromCreateWorkerinWorkerMenu()
  {
	    WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		
		WebElement workers=driver.findElement(By.xpath("//a[text()='Workers']"));
		workers.click();
		
		WebElement createworker=driver.findElement(By.xpath("//a[text()='Create Worker']"));
		createworker.click();
		
		WebElement titledropdown=driver.findElement(By.id("worker-title"));
		
		Select select=new Select(titledropdown);
		select.selectByIndex(2);
		
		WebElement selectedvalue=select.getFirstSelectedOption();
		String actualresult=selectedvalue.getText();
		String expectedresult="Mr";
		
		Assert.assertEquals(actualresult, expectedresult, "Not working as expected");	
	  
  }
  
  //5. Open the application --> Login to the application --> Navigate to "Client" menu -->Click "Create Client" sub menu --> Select the check-box - "Require Po" and verify the same is selected.
  
  @Test(enabled = false)
  public void verifySelectedValueInCheckBoxofCreateClientInClientMenu()
  {
	    WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		
		WebElement clienttab=driver.findElement(By.xpath("//a[text()='Clients']"));
		clienttab.click();
		
		WebElement createclient=driver.findElement(By.xpath("//a[text()='Create Client']"));
		createclient.click();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
	    js.executeScript("window.scrollBy(0,2500)", "");
		
		WebElement checkbox=driver.findElement(By.id("client-require_po"));
		checkbox.click();
		
		boolean actualresult=checkbox.isSelected();
		boolean expectedresult=true;
		
		Assert.assertEquals(actualresult, expectedresult, "Not working as expected");
	
  }
  
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String browser) 
  {
	  if(browser.equals("Chrome"))
	  {
	  driver=new ChromeDriver();
	  }else if(browser.equals("Edge"))
	  {
		  driver=new EdgeDriver();
	  }
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
