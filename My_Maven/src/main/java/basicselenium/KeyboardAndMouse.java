package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouse {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize(); 
		
		Actions mouse=new Actions(driver);
		
		WebElement doubleclick = driver.findElement(By.id("doubleClickBtn"));
		mouse.doubleClick(doubleclick).perform();
		
		WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
		mouse.contextClick(rightclick).perform();
		
		mouse.moveToElement(rightclick).perform();
		
		mouse.sendKeys(Keys.ARROW_DOWN);

	}

}
