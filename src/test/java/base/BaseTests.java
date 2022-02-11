package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    // Username and Password needed to login to the test site
    protected String GLOBAL_USERNAME;
    protected String GLOBAL_PASSWORD;

    public BaseTests() {
        /*
            This is not a great way to do it because the code needs to go into a repository.
            It would be safer to use environment variables in the code, then create
            environment variables with those names on the test machine and give them values.
            That way the actual variable values don't go to the repository.
        */
        this.GLOBAL_USERNAME = "";
        this.GLOBAL_PASSWORD = "";
    }

    @BeforeClass
    public void setUp() {
        // Specify which browser driver should be used by the tests
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

        homePage = new HomePage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
