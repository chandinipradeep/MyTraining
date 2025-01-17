package selenium_selfstudy;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LinkInNewTab {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement computerslink=driver.findElement(By.xpath("//a[text()='Computers ']"));
		//computerslink.click();
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).click(computerslink).keyUp(Keys.CONTROL).perform();		

	}

}
