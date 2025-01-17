package basicselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		//findelements returns list of webelements; so we have to declare it as List<WebElements>
		//whats diff between findelement and findelements??-->
		//findelement will return only single element//findelements will returns lists of elements
		
		List<WebElement> firstrow=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
		for(int i=0;i<firstrow.size();i++)
		{
			String firstrowvalues=firstrow.get(i).getText();
			System.out.println(firstrowvalues);
			
		}
		
		
	}

}
