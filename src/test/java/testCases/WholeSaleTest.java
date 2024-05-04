package testCases;

import org.checkerframework.checker.units.qual.A;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.ShopPage;
import pages.WholeSalePage;
import testBase.WebTestBase;

public class WholeSaleTest extends WebTestBase {
    public WholeSalePage wholeSalePage;
    public ShopPage shopPage;
    public HomePage homePage;

    @BeforeMethod
    public void preRequisite()
    {
        initialization();
        wholeSalePage=new WholeSalePage();
        shopPage=new ShopPage();
        homePage=new HomePage();
    }

    @Test(description = "verify User Able to Register Partnership Register Form")
    public void verifyUserAbleToRegisterPartnershipRegisterForm()
    {
        SoftAssert softAssert= new SoftAssert();
        shopPage.homeNewAdClose();
        homePage.closeAd();
        wholeSalePage.clickWholeSaleBtn();
        homePage.closeAd();
        wholeSalePage.scrollByWebElements();
        wholeSalePage.wholeSalePageAllInputs();

        softAssert.assertEquals("","","");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
