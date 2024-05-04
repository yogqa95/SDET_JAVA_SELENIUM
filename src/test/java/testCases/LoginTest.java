package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.ShopPage;
import testBase.WebTestBase;

public class LoginTest extends WebTestBase {
    public HomePage homePage;
    public LoginPage loginPage;
    public MyAccountPage myAccountPage;
    public ShopPage shopPage;

    public SoftAssert softAssert; //SoftAssert

    @BeforeMethod
    public void preRequisite()
    {
        initialization();
        homePage=new HomePage();
        loginPage=new LoginPage();
        myAccountPage=new MyAccountPage();
        shopPage =new ShopPage();
    }

    @Test(description = "Verify login with valid username and valid password")
    public void verifyLoginWithValidUserNameAndPassword()
    {
        softAssert=new SoftAssert();
        shopPage.homeNewAdClose();
        homePage.closeAd();
        homePage.clickOnTheLoginBtn();
        loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
        softAssert.assertEquals(myAccountPage.getTextOfMyAccount(),"MY ACCOUNT","MY ACCOUNT text should be Match");
        softAssert.assertAll();
    }
    
    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
