package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.ActionsUtil;
import utility.DropDownUtil;
import utility.JavaScriptUtil;
import utility.WebDriverUtil;

public class SubscriptionsPage extends WebTestBase {
    @FindBy(id = "menu-item-359695")
    WebElement subscriptionsBtn;

    @FindBy(xpath = "//a[@class='product-card product-card--margins']")
    WebElement clickProduct;

    @FindBy(xpath = "//select[@class='pa_weight']")
    WebElement selectWeight;

    @FindBy(xpath = "//label[@for='wholebeans-true']")
    WebElement selectWholeBeans;

    @FindBy(xpath = "//select[@class='pa_coffee']")
    WebElement selectCoffee;

    @FindBy(xpath = "//label[@for='pa_frequency-monthly']")
    WebElement selectRadioMonthly;

    @FindBy(xpath = "//select[@class='pa_subscription-length']")
    WebElement selectSubscriptionsLength;

    @FindBy(xpath = "//a[@class='quantity-input__icon quantity-input__icon--plus']")
    WebElement clickBtns;

    @FindBy(xpath = "//a[@class='button add-to-cart__button button--primary']")
    WebElement clickSubmit;

    @FindBy(xpath = "//a[text()='Checkout']")
    WebElement textSuccessfullySubscription;

    public SubscriptionsPage()
    {
        PageFactory.initElements(driver, this);
    }
    public void subscriptionsBtnClick()
    {
        ActionsUtil.actionsMoveToElement(subscriptionsBtn);
    }

    public void selectProduct()
    {
        WebDriverUtil.waitUntilElementToBeClickable(clickProduct);
    }

    public void selectWeight()
    {
        DropDownUtil.selectByValue(selectWeight);
    }

    public void selectWholeBeans()
    {
        WebDriverUtil.waitUntilElementToBeClickable(selectWholeBeans);
    }

    public void scrollByPixel()
    {
        JavaScriptUtil.scrollByPixel();
    }

    public void selectCoffee()
    {
        DropDownUtil.selectByIndex(selectCoffee);
    }

    public void selectMonthly()
    {
        WebDriverUtil.clickRadio(selectRadioMonthly);
    }

    public void selectSubscriptionsLength()
    {
        DropDownUtil.selectByIndex(selectSubscriptionsLength);
    }

    public void clickBtn()
    {
        WebDriverUtil.clickBtn(clickBtns);
    }

    public void setClickSubmit()
    {
        WebDriverUtil.clickBtn(clickSubmit);
    }


    public Boolean getTextSuccessfullySubscription()
    {
        WebDriverUtil.waitUntilElementToBeVisible(textSuccessfullySubscription);
       return WebDriverUtil.checkBtnIsEnabled(textSuccessfullySubscription);
    }

    public Boolean trueValue()
    {
       return WebDriverUtil.trueValue();
    }

}