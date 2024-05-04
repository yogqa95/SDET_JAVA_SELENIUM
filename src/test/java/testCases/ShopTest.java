package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ShopPage;
import testBase.WebTestBase;

public class ShopTest extends WebTestBase {
    public SoftAssert softAssert; //SoftAssert

    public ShopPage shopPage;

    @BeforeMethod
    public void preRequisite()
    {
        initialization();
        shopPage =new ShopPage();
    }

    @Test(description = "Verify user able to change sort by price highest to lowest")
    public void verifyUserLandedOnProductsPage()
    {
        softAssert=new SoftAssert();
        shopPage.homeNewAdClose();
        shopPage.productsBtnClick();
        shopPage.secondAdClose();
        shopPage.productsBtnClick();
        shopPage.selectShopShortVisibleText();
        softAssert.assertEquals(shopPage.getShopUrl(),"https://camposcoffee.com/shop?orderby=price-desc","User should be able to change SORT BY option");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown()
    {
      driver.close();
    }
}
