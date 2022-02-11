package search;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTests {
    @Test
    public void TC1() {
        // I chose 'Blouse' because of the simplicity but I've confirmed that it works for 'Dress' too.
        homePage.setSearchField("Blouse");
        homePage.clickSearchFieldSearchButton();
        assertTrue(homePage.getFirstSearchResultLinkText().contains("Blouse"),
                "The search returned the incorrect product");
        homePage.clearSearchField();
    }

    @Test
    public void TC2() {
        String searchString = "Printed,Blouse,T-shirts";
        String[] searchCriteria = searchString.split(",");
        for (int x = 0; x < searchCriteria.length; x++) {
            homePage.setSearchField(searchCriteria[x]);
            homePage.clickSearchFieldSearchButton();
            assertTrue(homePage.getFirstSearchResultLinkText().contains(searchCriteria[x]),
                    "The search returned the incorrect product");
            homePage.clearSearchField();
        }
    }
}
