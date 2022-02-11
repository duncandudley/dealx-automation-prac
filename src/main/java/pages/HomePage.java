package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Fields on 'Home page' used in this test suite
    private By signInLink = By.linkText("Sign in");
    private By searchField = By.id("search_query_top");
    private By searchFieldSearchButton = By.cssSelector("#searchbox button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSearchField(String searchString) {
        driver.findElement(searchField).sendKeys(searchString);
    }

    public void clearSearchField() {
        driver.findElement(searchField).clear();
    }

    public void clickSearchFieldSearchButton() {
        driver.findElement(searchFieldSearchButton).click();
    }

    public String getFirstSearchResultLinkText() {
        // The css selector used here points to the link text of the first search result. I'm taking
        // that text because it states what the result/product is.

        return driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a")).getText();
    }

    public LoginPage clickSignInLink() {
        driver.findElement(signInLink).click();
        return new LoginPage(driver);
    }
}
