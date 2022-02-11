package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Fields on 'Sign in' page used in this test suite
    private By emailAddressField = By.id("email");
    private By passwordField = By.id("passwd");
    private By signInButton = By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailAddressField(String emailAddress) {
        driver.findElement(emailAddressField).sendKeys(emailAddress);
    }

    public void setPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public MyAccountPage clickSignInButton() {
        driver.findElement(signInButton).click();
        return new MyAccountPage(driver);
    }
}