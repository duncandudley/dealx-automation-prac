package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    private WebDriver driver;

    // Fields on the 'My Account' page used in this test suite
    private By myAccountWelcomeText = By.cssSelector("#center_column > p");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    // Fetch the Welcome text that appears on the User's profile page
    public String getMyAccountWelcomeText() {
        return driver.findElement(myAccountWelcomeText).getText();
    }
}
