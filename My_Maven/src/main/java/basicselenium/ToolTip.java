package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement alltooltip=driver.findElement(By.id("searchDropdownBox"));
		String tooltipvalue=alltooltip.getDomAttribute("title");
		System.out.println(tooltipvalue);

	}

}
