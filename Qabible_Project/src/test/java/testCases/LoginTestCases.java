package testCases;

import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import org.testng.Assert;

public class LoginTestCases extends BaseClass {

	// Verify login page is working
	@Test
	public void verifyLoginPageWorking() {

		LoginPage lp = new LoginPage(driver);
		lp.performLogin("Carol", "1q2w3e4r");

		DashboardPage dp = new DashboardPage(driver);
		String actualResult = dp.getTextOfWelcomeText();
		String expectedResult = "Welcome to Payroll Application";

		Assert.assertEquals(actualResult, expectedResult, "Login Page not working as expected");
	}

	// Open the application --> Click "Reset It" hyper link --> Verify the text of
	// "Send" button.
	@Test
	public void verifyTheTextOfResetLinkSendButton() {
		LoginPage lp = new LoginPage(driver);
		lp.navigateToResetItLink();
		String actualResult = lp.getTextOfSendButtonInsideResetItLink();
		String expectedResult = "Send";

		Assert.assertEquals(actualResult, expectedResult,
				"Send button inside Reset It link is not working as expected");
	}

	// Open the application --> Click "Reset It" hyper link --> Verify the font type
	// of "Send" button text.
	@Test
	public void verifyFontTypeOfSendButtonInsideResetLink() {
		LoginPage lp = new LoginPage(driver);
		String actualResult = lp.getFontTypeOfSendButtonInsideResetItLink();
		String expectedResult = "Overpass, sans-serif";

		Assert.assertEquals(actualResult, expectedResult,
				"Send button inside Reset It link is not working as expected");
	}

}