package testCases;

import com.beust.ah.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SearchPage;
import pages.ShopPage;
import testBase.WebTestBase;

public class SearchTest extends WebTestBase {
    public SearchPage searchPage;
    public ShopPage shopPage;
    public HomePage homePage;

    @BeforeMethod()
    public void preRequisite()
    {
        initialization();
        searchPage=new SearchPage();
        shopPage=new ShopPage();
        homePage=new HomePage();
    }

    @Test(description = "Verify user able to search virtual machine in Search option")
    public void verifyUserAbleSearchVirtualMachine()
    {
        SoftAssert softAssert=new SoftAssert();
        shopPage.homeNewAdClose();
        homePage.closeAd();
        searchPage.setUserControlSearch();
        softAssert.assertEquals(searchPage.setValidateSearchSuccessful(),"FAQ","User should be search Virtual Machines");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
