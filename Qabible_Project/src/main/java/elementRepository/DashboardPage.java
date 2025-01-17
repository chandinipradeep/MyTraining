package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class DashboardPage {

	WebDriver driver;
	GeneralUtilities utilities=new GeneralUtilities();

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[text()='Welcome to Payroll Application']")
	WebElement welcomeText;
	
	@FindBy(xpath="//a[text()='Clients']")
	WebElement clientMenu;
	
	@FindBy(xpath = "//a[text()='Workers']")
	WebElement workersMenu;

	public String getTextOfWelcomeText() {
		return utilities.getElementText(welcomeText);
	}
	
	public void navigateToClientMenu() {
		utilities.clickOnElement(clientMenu);
	}
	
	public void navigateToWorkersMenu() {
		utilities.clickOnElement(workersMenu);
	}
	
	
}
