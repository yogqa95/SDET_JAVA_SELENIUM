package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.WebDriverUtil;

public class NewsLetterPage extends WebTestBase {
    @FindBy(xpath = "//li[@class='user-controls__ul__li user-controls__ul__li--newsletter']")
    WebElement clickNewsLetterUpdate;

    @FindBy(id = "input_8_1")
    WebElement firstName;

    @FindBy(id = "input_8_2")
    WebElement lastName;

    @FindBy(id = "input_8_3")
    WebElement email;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    WebElement clickSubscribeBtn;

    public NewsLetterPage()
    {
        PageFactory.initElements(driver, this);
    }

    public void clickNewsLetterUpdate()
    {
        WebDriverUtil.clickBtn(clickNewsLetterUpdate);
    }
    public void inputAllFields()
    {
        WebDriverUtil.firstName(firstName);
        WebDriverUtil.lastName(lastName);
        WebDriverUtil.email(email);
      //  WebDriverUtil.clickBtn(clickSubscribeBtn);
    }
}
