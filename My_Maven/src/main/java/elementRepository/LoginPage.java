package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
//	By userName=By.id("loginform-username"); //element declaration without pagefactory
//	By passWord=By.id("loginform-password");
//	By loginButton=By.xpath("//button[@class='btn btn-default']");

	@FindBy(id = "loginform-username")
	WebElement userName; // element declaration with page factory

	@FindBy(id = "loginform-password")
	WebElement passWord;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	WebElement loginButton;

	@FindBy(xpath = "//a[text()='reset it']")
	WebElement resetItLink;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	WebElement sendButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void inputUserName(String name) {
		// driver.findElement(userName).sendKeys("Carol"); //without pagefactory
		userName.sendKeys(name); // with pagefactory .
	}

	public void inputPassword(String password) {
		// driver.findElement(passWord).sendKeys("1q2w3e4r");
		passWord.sendKeys(password);
	}

	public void clickLoginButton() {
		// driver.findElement(loginButton).click();
		loginButton.click();
	}

	public void navigateToResetItLink() {
		resetItLink.click();
	}

	public String getTextOfSendButtonInsideResetItLink() {
		String sendButtonText = sendButton.getText();
		return sendButtonText;
	}

	public String getFontTypeOfSendButtonInsideResetItLink() {
		String sendButtonFontType = sendButton.getCssValue("font-family");
		return sendButtonFontType;
	}

}
