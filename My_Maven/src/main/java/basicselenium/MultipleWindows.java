package basicselenium;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1500)");
		
		WebElement newtabbutton=driver.findElement(By.id("tabButton"));
		newtabbutton.click();
		
		String parentwindow=driver.getWindowHandle(); 
		System.out.println("parent window id : "+parentwindow);
		//getWindowHandle() will return the id of the current window/parent window.. its under webdriver interface
		
		//getWindowHandles() will return the id of all the Window and will return as a collection of set.data will store as index based.index start from 0. 0th index will have id of parent window id. 1st index will have id of child window
		
		Set<String> allwindowsid=driver.getWindowHandles();
		System.out.println("All windows id : "+allwindowsid);
		for(String childwindow:allwindowsid)
		{
			if(!childwindow.equals(parentwindow))
			{
				driver.switchTo().window(childwindow);
				WebElement child=driver.findElement(By.id("sampleHeading"));
				String childtext=child.getText();
				System.out.println(childtext);
			}
		}
		
		driver.switchTo().window(parentwindow);
		WebElement newwindow=driver.findElement(By.id("windowButton"));
		String newwindowtext=newwindow.getText();
		System.out.println(newwindowtext);
		
		
	}

}
