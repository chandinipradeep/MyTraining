package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	WebDriver driver;

	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// By welcomeText=By.xpath("//p[text()='Welcome to Payroll Application']");

	@FindBy(xpath = "//p[text()='Welcome to Payroll Application']")
	WebElement welcomeText;

	@FindBy(xpath = "//a[text()='Clients']")
	WebElement clientMenu;

	@FindBy(xpath = "//a[text()='Workers']")
	WebElement workersMenu;

	public String getTextOfWelcomeText() {
		// String text=driver.findElement(welcomeText).getText();

		String text = welcomeText.getText();
		return text;
	}

	public void navigateToClientMenu() {
		clientMenu.click();
	}

	public void navigateToWorkersMenu() {
		workersMenu.click();
	}
}
