package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.DropDownUtil;
import utility.WebDriverUtil;

public class ShopPage extends WebTestBase {
    @FindBy(xpath = "//li[@class='user-controls__ul__li user-controls__ul__li--cart']")
    WebElement allProductBtn;

    @FindBy(xpath = "//a[@class='newsletter__close newsletter__trigger']")
    WebElement secondAd;

    @FindBy(xpath = "//button[@title='Close']")
    WebElement homeNewAd;

    @FindBy(id = "sort")
    WebElement shopSort;

    public ShopPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void productsBtnClick()
    {
        WebDriverUtil.productsClickBtn(allProductBtn);
    }

    public void secondAdClose()
    {
        WebDriverUtil.waitUntilElementToBeClickable(secondAd);
    }
    public void selectShopShortVisibleText()
    {
          DropDownUtil.selectByVisibleText(shopSort);
    }

    public String getShopUrl()
    {
        return driver.getCurrentUrl();
    }

    public void homeNewAdClose()
    {
        WebDriverUtil.waitUntilElementToBeClickable(homeNewAd);
    }
}
