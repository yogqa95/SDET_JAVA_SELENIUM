package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.ActionsUtil;
import utility.DropDownUtil;
import utility.JavaScriptUtil;
import utility.WebDriverUtil;

public class WholeSalePage extends WebTestBase {
    @FindBy(xpath = "//a[text()='Wholesale']")
    WebElement clickWholeSaleBtn;

    @FindBy(xpath = "//h3[text()='Partnership']")
    WebElement scrollWebElement;

    @FindBy(id = "input_5_25")
    WebElement firstName;

    @FindBy(id = "input_5_1")
    WebElement lastName;

    @FindBy(id = "input_5_2")
    WebElement phoneNumber;

    @FindBy(id = "input_5_3")
    WebElement emailId;

    @FindBy(id = "input_5_4")
    WebElement businessTypeDropDown;

    @FindBy(id = "input_5_5")
    WebElement businessName;

    @FindBy(id = "input_5_16")
    WebElement businessAddress;

    @FindBy(id = "input_5_23")
    WebElement state;

    @FindBy(id = "input_5_19")
    WebElement postCode;

    @FindBy(id = "input_5_17")
    WebElement businessNumber;

    @FindBy(id = "input_5_24")
    WebElement existingBusiness;

    @FindBy(id = "input_5_8")
    WebElement traindingDayAndHours;

    @FindBy(id = "input_5_9")
    WebElement experience;

    @FindBy(id = "input_5_12")
    WebElement weeklyCoffeeUses;

    @FindBy(id = "input_5_13")
    WebElement additionalInfo;

    @FindBy(id = "field_5_15")
    WebElement capchaCheck;

    @FindBy(id = "gform_submit_button_5")
    WebElement registerBtn;

    public WholeSalePage()
    {
        PageFactory.initElements(driver, this);
    }

    public void clickWholeSaleBtn()
    {
        WebDriverUtil.clickBtn(clickWholeSaleBtn);
    }

    public void scrollByWebElements()
    {
        JavaScriptUtil.scrollByWebElement(scrollWebElement);
    }

    public void wholeSalePageAllInputs()
    {
        WebDriverUtil.firstName(firstName);
        WebDriverUtil.lastName(lastName);
        WebDriverUtil.phoneNumber(phoneNumber);
        WebDriverUtil.email(emailId);
        DropDownUtil.selectByVisibleTextWholeSale1(businessTypeDropDown);
        WebDriverUtil.businessName(businessName);
        WebDriverUtil.businessAddress(businessAddress);
        DropDownUtil.selectByVisibleTextWholeSale2(state);
        WebDriverUtil.postCode(postCode);
        WebDriverUtil.aBNumber(businessNumber);
        DropDownUtil.selectByIndex(existingBusiness);
        WebDriverUtil.trendingDayAndHour(traindingDayAndHours);
        WebDriverUtil.experience(experience);
        WebDriverUtil.weeklyCoffeeUses(weeklyCoffeeUses);
        WebDriverUtil.additionalInfo(additionalInfo);
        WebDriverUtil.clickBtn(registerBtn);
    }
}
