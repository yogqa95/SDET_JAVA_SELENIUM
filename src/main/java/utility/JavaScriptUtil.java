package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import testBase.WebTestBase;

public class JavaScriptUtil extends WebTestBase {
    public static JavascriptExecutor js;
    public static void scrollByPixel()
    {
         js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 350)");
    }

    public  static void scrollByWebElement(WebElement elemente)
    {
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",elemente);
        js.executeScript("window.scrollBy(0, -100)");

    }
}
