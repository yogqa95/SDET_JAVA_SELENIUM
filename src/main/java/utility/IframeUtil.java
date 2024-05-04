package utility;

import testBase.WebTestBase;

public class IframeUtil extends WebTestBase {
    public static void iframeHandling()
    {
        driver.switchTo().frame(3);
    }
}
