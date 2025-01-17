package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		//step 1:switch driver to frame
		//overloading is happening here. Same method name "frame" but there are different parameters
		driver.switchTo().frame("frame1");//id of frame as parameter for switching driver to the frame
		
		//step 2:declare any web element inside the iframe
		WebElement frametext=driver.findElement(By.id("sampleHeading")); //declare web element inside the frame
		String frametextvalue=frametext.getText(); 
		System.out.println(frametextvalue); 
		
		//step 3:switch back driver back to main website
		driver.switchTo().defaultContent(); //used to switch back to the main website
		//driver.switchTo().parentFrame();  //used to switch back to the parent website 
		

	}

}
