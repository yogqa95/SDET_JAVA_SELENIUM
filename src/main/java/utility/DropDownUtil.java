package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testBase.WebTestBase;
public class DropDownUtil extends WebTestBase {
 public static Select select;
    public static final int SELECT_BY_INDEX = 2;
    public static final String SELECT_BY_VALUE = "500g";
    public static final String SELECT_BY_VISIBLE_TEXT = "Price (highest)";

    public static final String SELECT_BY_VISIBLE_TEXT1 = "Other";

    public static final String SELECT_BY_VISIBLE_TEXT2 = "WA";
    public static void selectByValue(WebElement element)
    {
        select=new Select(element);
        select.selectByValue(SELECT_BY_VALUE);
    }
     public static void selectByIndex(WebElement element)
    {
        select=new Select(element);
        select.selectByIndex(SELECT_BY_INDEX);
    }
    public static void selectByVisibleText(WebElement element)
    {
        select=new Select(element);
        select.selectByVisibleText(SELECT_BY_VISIBLE_TEXT);
    }

    public static void selectByVisibleTextWholeSale1(WebElement element)
    {
        select=new Select(element);
        select.selectByVisibleText(SELECT_BY_VISIBLE_TEXT1);
    }

    public static void selectByVisibleTextWholeSale2(WebElement element)
    {
        select=new Select(element);
        select.selectByVisibleText(SELECT_BY_VISIBLE_TEXT2);
    }


}
