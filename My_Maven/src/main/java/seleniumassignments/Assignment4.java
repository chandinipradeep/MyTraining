package seleniumassignments;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("loginform-username"));
		username.sendKeys("carol");
		
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		loginbutton.click();
		
		//Navigate to Worker menu
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(10000));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[text()='Workers']")));
		
		WebElement workers=driver.findElement(By.xpath("//a[text()='Workers']"));
		workers.click();
		
		//Search 
	
		WebElement search=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofMillis(50000));
		boolean searchtext=wait1.until(ExpectedConditions.textToBePresentInElement(search, "Search"));
		System.out.println(searchtext);
		//search.click();
		
		
		//Delete 
		
		WebElement delete=driver.findElement(By.xpath("//table[@class='table table-striped table-bordered']//tbody//tr[1]//td[8]//a[@title='Delete']"));
		delete.click();
        WebDriverWait wait2=new WebDriverWait(driver, Duration.ofMillis(10000));
		wait2.until(ExpectedConditions.alertIsPresent());
	    driver.switchTo().alert().accept();
		
		//class attribute
		
		WebElement labelelement=driver.findElement(By.xpath("//label[text()='First Name']"));
		boolean classattribute=wait1.until(ExpectedConditions.attributeContains(labelelement, "class", "control-label"));
		System.out.println("Class attribute is present ? "+classattribute);
		
	

	}

}
