package testCases;

import org.testng.annotations.Test;

import elementRepository.ClientPage;
import elementRepository.DashBoardPage;
import elementRepository.LoginPage;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ClientTabTestCases {

	WebDriver driver;

	@Test
	public void verifyToolTipValueOfEditIconInTableOfClientMenu() {

		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("Carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashBoardPage dp = new DashBoardPage(driver);
		dp.navigateToClientMenu();

		ClientPage cp = new ClientPage(driver);
		String actualResult = cp.getTooltipValueOfUpdateIcon();
		String expectedResult = "Update";

		Assert.assertEquals(actualResult, expectedResult, "Tooltip of Edit icon is not working as expected");
	}

	@Test
	public void verifySelectedValueInCheckBoxofCreateClientInClientMenu() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("Carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();

		DashBoardPage dp = new DashBoardPage(driver);
		dp.navigateToClientMenu();

		ClientPage cp = new ClientPage(driver);
		boolean actualResult = cp.navigateToCreateClientAndSelectValueInCheckBox();
		boolean expectedResult = true;

		Assert.assertEquals(actualResult, expectedResult, "Checkbox of Create client menu is not working as expected");
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
