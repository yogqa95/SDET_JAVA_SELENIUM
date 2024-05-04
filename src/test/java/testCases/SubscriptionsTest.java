package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ShopPage;
import pages.SubscriptionsPage;
import testBase.WebTestBase;

public class SubscriptionsTest extends WebTestBase {
    public SubscriptionsPage subscriptionsPage;
    public ShopPage shopPage;
    public SoftAssert softAssert;

    @BeforeMethod
    public void preRequisite()
    {
        initialization();
        subscriptionsPage = new SubscriptionsPage();
        shopPage = new ShopPage();
    }

    @Test(description = "Verify user able to add Subscriptions")
    public void verifyUserAddSubscriptions() {
        softAssert=new SoftAssert();
        shopPage.homeNewAdClose();
        shopPage.secondAdClose();
        subscriptionsPage.subscriptionsBtnClick();
        shopPage.secondAdClose();
        subscriptionsPage.selectProduct();
        subscriptionsPage.selectWeight();
        subscriptionsPage.scrollByPixel();
        subscriptionsPage.selectWholeBeans();
        subscriptionsPage.selectCoffee();
        subscriptionsPage.scrollByPixel();
        subscriptionsPage.selectMonthly();
        subscriptionsPage.selectSubscriptionsLength();
        subscriptionsPage.clickBtn();
        subscriptionsPage.setClickSubmit();
        subscriptionsPage.getTextSuccessfullySubscription();
        softAssert.assertEquals(subscriptionsPage.getTextSuccessfullySubscription(),subscriptionsPage.trueValue(),",user should be able to subscription successful");
        softAssert.assertAll();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
