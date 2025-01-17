package basicselenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/select-input.php");
		driver.manage().window().maximize();
		
		WebElement dropdown=driver.findElement(By.id("single-input-field"));
		
		
		//select is used to do different functions in dropdown. select is a selenium class
		
		Select select=new Select(dropdown);
		select.selectByVisibleText("Red"); //used to interact with dropdown. we can select value from dropdowwn using selectByVisibleText
		select.selectByIndex(3);//fetch value by giving index of dropdown
		select.selectByValue("Yellow");
		
		WebElement firstselectedoption=select.getFirstSelectedOption();//used to fetch the current selected value from dropdown and it returns webelements
		System.out.println(firstselectedoption);
		String dropdownvalue=firstselectedoption.getText(); //get the text value from webelement using getText() and store in string variable
		System.out.println(dropdownvalue);
		
		WebElement multidropdown=driver.findElement(By.id("multi-select-field"));
		Select select1=new Select(multidropdown);
		select1.selectByVisibleText("Red");
		select1.selectByVisibleText("Yellow");

		//list is used to print multiple values from dropdown
		List<WebElement> multiselect=select1.getAllSelectedOptions();
		for(int i=0;i<multiselect.size();i++)
		{
			String multidropdownvalue=multiselect.get(i).getText(); //get the text value 
			System.out.println(multidropdownvalue);
		}

	}

}
