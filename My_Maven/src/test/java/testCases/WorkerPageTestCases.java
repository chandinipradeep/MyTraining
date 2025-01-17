package testCases;

import org.testng.annotations.Test;

import elementRepository.DashBoardPage;
import elementRepository.LoginPage;
import elementRepository.WorkerPage;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
public class WorkerPageTestCases {
	WebDriver driver;

	@Test
	public void verifySelectedValueOfTitleDropDownFromCreateWorkerinWorkerMenu() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("Carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashBoardPage dp = new DashBoardPage(driver);
		dp.navigateToWorkersMenu();

		WorkerPage wp = new WorkerPage(driver);
		String actualResult = wp.getSelectedValueOfTitleDropdownInCreateWorkerMenu();
		String expectedResult = "Ms";

		Assert.assertEquals(actualResult, expectedResult,
				"Title Dropdown of Create Worker Menu is not working as expected");

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
