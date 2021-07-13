package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import tests.BaseTest;

public class LoginPage extends BaseTest {
	private WebDriver driver;
	private By usernameField = By.cssSelector("input[id='log']");
	private By passwordField = By.cssSelector("input[id='password']");
	private By submitButton = By.cssSelector("input[class='submit_button']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public void setUsername(String username) {
		driver.findElement(usernameField).sendKeys(username);
	}
	
	
	public void setPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public LoggedUser clickSubmitButton() {
		driver.findElement(submitButton).click();
		return new LoggedUser(driver);
	}
	
}
