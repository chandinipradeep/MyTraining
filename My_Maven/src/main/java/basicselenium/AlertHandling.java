package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		
		WebElement button1=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		button1.click();
		
		//switchTo--to handle alerts..
		driver.switchTo().alert().accept();  //to click on OK button on alert popup
		
		WebElement button2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		button2.click();
		
		driver.switchTo().alert().dismiss(); //to click on dismiss/cancel on the alert popup
		
		WebElement button3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button3.click();
		
		String alerttext=driver.switchTo().alert().getText(); //to get the text from alert box
		System.out.println(alerttext);
		
		driver.switchTo().alert().sendKeys("Hi"); //not working
		

	}

}
