package seleniumassignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		
		List<WebElement> tablefooter=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tfoot//tr//th"));
		System.out.println("Table Footer Values  :");
		for(int i=0;i<tablefooter.size();i++)
		{
			String footervalues=tablefooter.get(i).getText();
			System.out.println(footervalues);
		}
		
		List<WebElement> thirdcolumn=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//td[3]"));
		System.out.println("Table Third column values  :");
		for(int i=0;i<thirdcolumn.size();i++)
		{
			String thirdcolumnvalues=thirdcolumn.get(i).getText();
			System.out.println(thirdcolumnvalues);
		}
		
		List<WebElement> fourthrow=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td"));
		System.out.println("Table Fourth row values  :");
		for(int i=0;i<fourthrow.size();i++)
		{
		    String fourthrowvalues=fourthrow.get(i).getText();
		    System.out.println(fourthrowvalues);
		}
		

	}

}
