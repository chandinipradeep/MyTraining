package elementRepository;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	WebDriver driver;

	public ClientPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//table[@class='table table-striped table-bordered']//tbody//tr[1]//a[2]")
	WebElement updateIconToolTip;

	@FindBy(xpath = "//a[text()='Create Client']")
	WebElement createClientMenu;

	@FindBy(id = "client-require_po")
	WebElement createClientCheckBox;

	public String getTooltipValueOfUpdateIcon() {
		String toolTipText = updateIconToolTip.getDomAttribute("title");
		return toolTipText;
	}

	public boolean navigateToCreateClientAndSelectValueInCheckBox() {
		createClientMenu.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)", "");
		createClientCheckBox.click();
		boolean checkboxSelection = createClientCheckBox.isSelected();
		return checkboxSelection;
	}

}
