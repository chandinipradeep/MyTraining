package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.ClientPage;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;

public class ClientTestCase extends BaseClass {

	// Open the application --> Login to the application --> Navigate to "Client"
	// menu --> verify the tooltip value for "Edit" icon for any row in the table.
	@Test
	public void verifyToolTipValueOfEditIconInTableOfClientMenu() {
		LoginPage lp = new LoginPage(driver);
		lp.performLogin("Carol", "1q2w3e4r");
		DashboardPage dp = new DashboardPage(driver);
		dp.navigateToClientMenu();

		ClientPage cp = new ClientPage(driver);
		String actualResult = cp.getTooltipValueOfUpdateIcon();
		String expectedResult = "Update";

		Assert.assertEquals(actualResult, expectedResult, "Tooltip of Edit icon is not working as expected");
	}

	// Open the application --> Login to the application --> Navigate to "Client"
	// menu -->Click "Create Client" sub menu --> Select the check-box - "Require
	// Po" and verify the same is selected.
	@Test
	public void verifySelectedValueInCheckBoxofCreateClientInClientMenu() {
		LoginPage lp = new LoginPage(driver);
		lp.performLogin("Carol", "1q2w3e4r");

		DashboardPage dp = new DashboardPage(driver);
		dp.navigateToClientMenu();

		ClientPage cp = new ClientPage(driver);
		boolean actualResult = cp.isCheckBoxSelectedInCreateClientMenu();
		boolean expectedResult = true;

		Assert.assertEquals(actualResult, expectedResult, "Checkbox is not working as expected");
	}
}
