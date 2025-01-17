package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Hello!!..Welcome..");
		
		WebElement showmessage=driver.findElement(By.cssSelector("button#button-one"));
		showmessage.click();
		
		WebElement value_a=driver.findElement(By.xpath("//input[@id='value-a']"));
		value_a.sendKeys("10");
		
		WebElement value_b=driver.findElement(By.xpath("//input[@id='value-b']"));
		value_b.sendKeys("20");
		
		WebElement gettotal=driver.findElement(By.cssSelector("button#button-two"));
		gettotal.click();
		
		String messagebuttontext=showmessage.getText();
		System.out.println(messagebuttontext);
		
		String totalbuttontext=gettotal.getText();
		System.out.println(totalbuttontext);
		
		String messagestyle=showmessage.getCssValue("background-color");
		System.out.println("Show message button background color : "+messagestyle);
		
		String totalstyle=gettotal.getCssValue("font-size");
		System.out.println("Get Total button font size : "+totalstyle);
		
		String showmessagetagname=showmessage.getTagName();
		System.out.println("Show Message button tagname : "+showmessagetagname);
		
		String gettotaltagname=gettotal.getTagName();
		System.out.println("Get total button tagname : "+gettotaltagname);
		
		String showmessageattribute=showmessage.getAttribute("class");
		System.out.println("Show message button attribute value : "+showmessageattribute);
		
		String gettotalattribute=gettotal.getAttribute("type");
		System.out.println("Get total button attribute value : "+gettotalattribute);

	}

}
