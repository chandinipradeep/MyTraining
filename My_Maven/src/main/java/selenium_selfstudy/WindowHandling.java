package selenium_selfstudy;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		WebElement searchfeild = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		searchfeild.sendKeys("test");
		
		WebElement searchbutton = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		searchbutton.click();
		
		WebElement link1=driver.findElement(By.xpath("//a[text()='Test']"));
		link1.click();
		
		WebElement link2=driver.findElement(By.xpath("//a[text()='Test cricket']"));
		link2.click();
		
		WebElement link3=driver.findElement(By.xpath("//a[text()='Testosterone']"));
		link3.click();
		
		WebElement link4=driver.findElement(By.xpath("//a[text()='Testicle']"));
		link4.click();
		
		Set<String> allwindowid=driver.getWindowHandles();
		System.out.println(allwindowid);
		
		for(String id:allwindowid)
		{
			String title=driver.switchTo().window(id).getTitle();
			System.out.println(title);
			if(title.equals("Test cricket - Wikipedia"))
			{
				driver.switchTo().window(id).close();
			}
		}

	}

}
