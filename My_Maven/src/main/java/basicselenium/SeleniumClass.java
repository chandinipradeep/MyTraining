package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com"); //to open the given url in chrome browser
		driver.manage().window().maximize();  //to maximize the browser window
		
		String title=driver.getTitle(); //to get title of the page
		System.out.println(title);
		
		String currenturl=driver.getCurrentUrl();//to get the current url
		System.out.println(currenturl);
		
		String pagesource=driver.getPageSource(); //to get the html code/source code of the current page in browser
		System.out.println(pagesource);
		
		driver.navigate().back();  // browser backward button
		//Thread.sleep(10000);
		driver.navigate().forward(); //browser forward button
		//Thread.sleep(10000);
		driver.navigate().refresh(); //refresh the browser
		//Thread.sleep(10000);
		//driver.close(); //to close the browser
		driver.quit(); // to close browser
		driver.manage().deleteAllCookies();// to delete cookies opened in browser
		
	} 

}
