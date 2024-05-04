package testCases;

import org.openqa.selenium.remote.HttpCommandExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.NewsLetterPage;
import pages.ShopPage;
import testBase.WebTestBase;

public class NewsLetterTest extends WebTestBase {
    public NewsLetterPage newsLetterPage;
    public ShopPage shopPage;
    public HomePage homePage;

    @BeforeMethod
    public void preRequisite()
    {
        initialization();
        newsLetterPage=new NewsLetterPage();
        shopPage=new ShopPage();
        homePage=new HomePage();
    }
    @Test(description = "Verify User able to update letter")
    public void verifyUserAbleUdateLetter()
    {
        SoftAssert softAssert=new SoftAssert();
        shopPage.homeNewAdClose();
        homePage.closeAd();
        newsLetterPage.clickNewsLetterUpdate();
        newsLetterPage.inputAllFields();
        softAssert.assertEquals("","","user should be able to update all details");
        softAssert.assertAll();
    }
    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
