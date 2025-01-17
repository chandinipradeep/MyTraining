package basicselenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000)); //implicit wait
		
		WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000)); //explicit wait
	//	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Clients']")));
		WebElement clientstab=driver.findElement(By.xpath("//a[text()='Clients']"));
		clientstab.click();
		
		
		//wait-is used to avoid unwanted failures, like when a new page is loaded, we need to put driver on wait 
		//3 types of wait
		//implicit wait --> when there is page load ie; when page reloaded from one page to another,put driver in wait until all the elements in new page are loaded 
		//explicit wait --> its element specific, here we give wait for a specific web element
		
		//fluent wait
		
		// Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		   Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30L)) //maximum time for driver to wait.will check for the element max 30s, if not present in 30s, it will give no such element exception
		       .pollingEvery(Duration.ofSeconds(5L)) //its a checkpoint. will check in every 5s whether the element is present or not.it will check until the element is present
		       .ignoring(NoSuchElementException.class);

		   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		   });

	}

}
