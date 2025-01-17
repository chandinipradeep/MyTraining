package testCases;

import org.testng.annotations.Test;
import elementRepository.DashBoardPage;
import elementRepository.LoginPage;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginTestCases {

	WebDriver driver;

	@Test
	public void verifyLoginPageWorking() {
		LoginPage lp = new LoginPage(driver);
		lp.inputUserName("Carol");
		lp.inputPassword("1q2w3e4r");
		lp.clickLoginButton();
		DashBoardPage dp = new DashBoardPage(driver);
		String actualResult = dp.getTextOfWelcomeText();
		String expectedResult = "Welcome to Payroll Application";

		Assert.assertEquals(actualResult, expectedResult, "Login Page not working as expected");
	}

	@Test
	public void verifyTheTextOfResetLinkSendButton() {
		LoginPage lp = new LoginPage(driver);
		lp.navigateToResetItLink();
		String actualResult = lp.getTextOfSendButtonInsideResetItLink();
		String expectedResult = "Send";

		Assert.assertEquals(actualResult, expectedResult,
				"Send button inside Reset It link is not working as expected");
	}

	@Test
	public void verifyFontTypeOfSendButtonInsideResetLink() {
		LoginPage lp = new LoginPage(driver);
		lp.navigateToResetItLink();
		String actualResult = lp.getFontTypeOfSendButtonInsideResetItLink();
		String expectedResult = "Overpass, sans-serif";

		Assert.assertEquals(actualResult, expectedResult,
				"Send button inside Reset It link is not working as expected");
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
