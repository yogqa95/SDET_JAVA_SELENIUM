package utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testBase.WebTestBase;

public class ActionsUtil extends WebTestBase {
    public static Actions actions;
    public static void actionsMoveToElement(WebElement element)
    {
        actions=new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }

    public static void actionsEnterBtn()
    {
        actions=new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }
}
