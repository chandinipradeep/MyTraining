package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxButton {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
		WebElement checkbox =driver.findElement(By.id("gridCheck"));
		//checkbox.click();
		boolean a=checkbox.isSelected();// isSelected is used to determine the element is selected or not. returns true/fasle value, thats why using boolean
		System.out.println(a);
		
		boolean b=checkbox.isDisplayed();//used to determine whether the element is displayed in front end or not
		System.out.println(b);
		
		boolean c=checkbox.isEnabled();//used to check whether the checkbox is currently enabled or not
		System.out.println(c);
		
		
		

	}

}
