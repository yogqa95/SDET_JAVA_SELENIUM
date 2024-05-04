package pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.WebTestBase;
import utility.ActionsUtil;
import utility.WebDriverUtil;

public class SearchPage extends WebTestBase {

    @FindBy(id = "s")
    WebElement userSentValueSearch;

    @FindBy(xpath = "//h4[text()='FAQ']")
    WebElement validateSearchSuccessful;
    {
        PageFactory.initElements(driver, this);
    }

    public void setUserControlSearch()
    {
        WebDriverUtil.sentString(userSentValueSearch);
        ActionsUtil.actionsEnterBtn();
    }

    public String setValidateSearchSuccessful()
    {
       return WebDriverUtil.getTextElement(validateSearchSuccessful);
    }
}
