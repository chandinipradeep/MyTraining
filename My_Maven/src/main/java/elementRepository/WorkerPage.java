package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WorkerPage {

	WebDriver driver;
	Select select;

	@FindBy(xpath = "//a[text()='Create Worker']")
	WebElement createWorkerMenu;

	@FindBy(id = "worker-title")
	WebElement titleDropdown;

	WebElement selectedDropdownOption;

	public WorkerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getSelectedValueOfTitleDropdownInCreateWorkerMenu() {
		createWorkerMenu.click();
		select = new Select(titleDropdown);
		select.selectByIndex(2);

		selectedDropdownOption = select.getFirstSelectedOption();
		String dropdownText = selectedDropdownOption.getText();
		return dropdownText;

	}

}
