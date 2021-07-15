package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.LoggedUser;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void testValidLogin() {
		
		LoginPage loginPage = homePage.navigateToLogin();
		loginPage.setUsername("TestUser");
		loginPage.setPassword("12345@67890");
		LoggedUser logedUser = loginPage.clickSubmitButton();
		assertEquals(logedUser.readUserName(), "Test User3");
		
		
	}

}
