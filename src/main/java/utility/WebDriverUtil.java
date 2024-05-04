package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.WebTestBase;

import java.time.Duration;

public class WebDriverUtil extends WebTestBase {
    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITLY_WAIT = 20;

    public static WebDriverWait webDriverWait;

    public static final long explicitWait = 20;

    public static final Boolean b=true;

    public static final String SEARCH = "Virtual Machin";
    public static final String FIRST_NAME = "Yogesh";
    public static final String LAST_NAME = "Garje";
    public static final String EMAIL = "Yogesh@gmail.com";
    public static final String PHONE_NUMBER = "9090909090";
    public static final String BUSINESS_NAME = "YOG Pvt Ltd";
    public static final String BUSINESS_ADDRESS = "WEST AUSTRALIA";
    public static final String POST_CODE = "4481";
    public static final String ABN = "54365423457";
    public static final String TRENDING_DAY_AND_HOURS ="from 09:15 AM and close at 03:30 PM";
    public static final String EXPERIENCE = "8";
    public static final String WEEKLY_COFFEE_USES = "50";
    public static final String ADDITIONAL_INFO = "Starting a coffee business requires careful planning and preparation. Here are the key steps involved in starting a successful coffee business";


    public static void waitUntilElementToBeClickable(WebElement element)
    {
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public static void waitUntilElementToBeVisible(WebElement element)
    {
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(explicitWait));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void sendKeysByElementLoginPage(WebElement element, String text)
    {
        element.sendKeys(text);
    }

    public static String getTextElement(WebElement element)
    {
       return element.getText();
    }

    public static void productsClickBtn(WebElement element)
    {
        element.click();
    }

    public static void clickRadio(WebElement radio)
    {
        radio.click();
    }

    public static void clickBtn(WebElement clickBtn)
    {
        clickBtn.click();
    }

    public static Boolean checkBtnIsEnabled(WebElement element)
    {
        Boolean a=true;
        return element.isEnabled();
    }

    public static Boolean trueValue()
    {
       return  b;
    }

    public static void sentString(WebElement element)
    {
        element.click();
        element.sendKeys(SEARCH);
    }


    public static void firstName(WebElement element)
    {
        element.sendKeys(FIRST_NAME);
    }
    public static void lastName(WebElement element)
    {
        element.sendKeys(LAST_NAME);
    }
    public static void phoneNumber(WebElement element)
    {
        element.sendKeys(PHONE_NUMBER);
    }
    public static void email(WebElement element)
    {
        element.sendKeys(EMAIL);
    }
    public static void businessName(WebElement element)
    {
        element.sendKeys(BUSINESS_NAME);
    }
    public static void businessAddress(WebElement element)
    {
        element.sendKeys(BUSINESS_ADDRESS);
    }
    public static void postCode(WebElement element)
    {
        element.sendKeys(POST_CODE);
    }
    public static void aBNumber(WebElement element)
    {
        element.sendKeys(ABN);
    }
    public static void trendingDayAndHour(WebElement element)
    {
        element.sendKeys(TRENDING_DAY_AND_HOURS);
    }

    public static void experience(WebElement element)
    {
        element.sendKeys(EXPERIENCE);
    }

    public static void weeklyCoffeeUses(WebElement element)
    {
        element.sendKeys(WEEKLY_COFFEE_USES);
    }

    public static void additionalInfo(WebElement element)
    {
        element.sendKeys(ADDITIONAL_INFO);
    }

}
