package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.LoginPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void TC4() {
        LoginPage loginPage = homePage.clickSignInLink();
        loginPage.setEmailAddressField(GLOBAL_USERNAME);
        loginPage.setPasswordField(GLOBAL_PASSWORD);

        MyAccountPage myAccountPage = loginPage.clickSignInButton();
        assertEquals(myAccountPage.getMyAccountWelcomeText(),
                "Welcome to your account. Here you can manage all of your personal information and orders.");
    }
}
