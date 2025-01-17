package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementCommands {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		//WebElement username=driver.findElement(By.id("loginform-username")); //by is a selenium class,by is used to decide which locator is used// findElement is a method of driver
		//username.sendKeys("Welcome");//sendKeys is used to input any text in the textbox field
		WebElement password=driver.findElement(By.id("loginform-password"));
		password.sendKeys("password");
		
		//xpath syntax
		//syntax1 : //tagName[@attributeType='attributeValue']
		//syntax2 : //tagName[text()='visibleText']
		
		WebElement login=driver.findElement(By.xpath("//button[text()='Login']")); 
		//login.click();//to click the button
		//username.clear(); //to clear the text value in the textbox
		
		//to automate style properties like font type,background color etc..
		
		String backgroundcolor=login.getCssValue("background-color");
		System.out.println("Background color "+backgroundcolor);
		
		//getAttribute is used to get the attribute values of any element
		
		String attributevalue=login.getDomAttribute("class"); //give attribute type as parameter, it will return attribute value
		System.out.println(attributevalue);
		
		//fetch tag name of any element --- used to verify the element tagname in the frontend
		//used when we have testcase for verifing the given tagname is displaying in the frontend
		
		String tagname=login.getTagName();
		System.out.println(tagname);
		
		//getText is used to get visible text of any element
		
		String text=login.getText();
		System.out.println(text);
		
		//cssSelector
		//syntax 1: //tagName#idValue
		//syntax 2: //tagName.classAttributeValue
		//syntax 3: //tagName[attributeType=attributeValue]
		
		WebElement username=driver.findElement(By.cssSelector("input#loginform-username"));
		username.sendKeys("UserName");
		

	}

}
