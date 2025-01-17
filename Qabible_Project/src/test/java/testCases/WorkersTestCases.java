package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import elementRepository.DashboardPage;
import elementRepository.LoginPage;
import elementRepository.WorkerPage;

public class WorkersTestCases extends BaseClass {

	// Open the application --> Login to the application --> Navigate to "Worker"
	// menu --> Click "Create Worker" sub menu --> Select any value from the "Title"
	// drop-down and verify the selected value.

	@Test
	public void verifySelectedValueOfTitleDropDownFromCreateWorkerinWorkerMenu() {
		LoginPage lp = new LoginPage(driver);
		lp.performLogin("Carol", "1q2w3e4r");

		DashboardPage dp = new DashboardPage(driver);
		dp.navigateToWorkersMenu();

		WorkerPage wp = new WorkerPage(driver);
		String actualResult = wp.getSelectedValueOfTitleDropdownInCreateWorkerMenu();
		String expectedResult = "Ms";

		Assert.assertEquals(actualResult, expectedResult,
				"Title Dropdown of Create Worker Menu is not working as expected");
	}
}
