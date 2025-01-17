package basicselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/selenium/upload/");
		driver.manage().window().maximize();
		
		//in selenium there is no specific function for file upload, so we use Robot class in Java
		Robot robot=new Robot(); //Robot is predefined class in Java
		//robot.keyPress(KeyEvent.VK_CONTROL);
		//robot.keyRelease(KeyEvent.VK_CONTROL);
		
		WebElement uploadbutton=driver.findElement(By.id("uploadfile_0"));
		//uploadbutton.click();  //here tagname of choose file is input ,so we cannot perform click(),we can perform click() only if the tagname is button. so we need to first mouse hover on choose file and perform click()
		
		Actions action=new Actions(driver);  //action class is used to perform mouse hover
		action.moveToElement(uploadbutton).click().perform();
		
		//copy any keyword to system clipboard - Java class StringSelection and getSystemClipboard method.
	     StringSelection ss = new StringSelection("C:\\Users\\jishn\\Desktop\\Excelread.xlsx");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	     
	     robot.keyPress(KeyEvent.VK_CONTROL);
	     robot.delay(1000);
	     robot.keyPress(KeyEvent.VK_V);
	     robot.keyRelease(KeyEvent.VK_V);
	     robot.delay(1000);
	     robot.keyRelease(KeyEvent.VK_CONTROL);
	     robot.keyPress(KeyEvent.VK_ENTER);
	     robot.delay(1000);
	     robot.keyRelease(KeyEvent.VK_ENTER);
	     robot.delay(1000);
	     
	     WebElement submitfile=driver.findElement(By.id("submitbutton"));
	     submitfile.click();
	     
	}

}
