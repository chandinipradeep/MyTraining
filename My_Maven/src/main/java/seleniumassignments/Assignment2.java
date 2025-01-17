package seleniumassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		
		WebElement maleradiobutton=driver.findElement(By.id("inlineRadio1"));
		maleradiobutton.click();
		
		boolean radiobutton1=maleradiobutton.isSelected();
		System.out.println(radiobutton1);
		
		WebElement femaleradiobutton=driver.findElement(By.id("inlineRadio2"));
		femaleradiobutton.click();
		
		boolean radiobutton2=femaleradiobutton.isSelected();
		System.out.println(radiobutton2);
		
		WebElement showselectedvalue_btn=driver.findElement(By.id("button-one"));
		showselectedvalue_btn.click();
		
		boolean button1=showselectedvalue_btn.isDisplayed();
		System.out.println(button1);
		
		boolean button2=showselectedvalue_btn.isEnabled();
		System.out.println(button2);
		

	}

}
