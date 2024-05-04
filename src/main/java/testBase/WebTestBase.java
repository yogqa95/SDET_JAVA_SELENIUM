package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.WebDriverUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebTestBase {
    public static WebDriver driver;
    public Properties prop;

    public WebTestBase() {
        FileInputStream fileInputStream=null;
        try
        {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/properties/config.properties");
        }catch (Exception e)
        {
            e.printStackTrace();
        }

         prop = new Properties();
        try {
            prop.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void initialization()
    {
        String browser = prop.getProperty("browserName");
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir" ) + "/src/main/resources/driver/chromedriver.exe");
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") +"/src/main/resources/driver/geckodriver.exe");
            driver=new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") + "/src/main/resources/driver/msedgedriver.exe");
            driver=new EdgeDriver();
        }else
        {
            throw new RuntimeException("Please select correct browser like chrome, firefox or edge");
        }

        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WebDriverUtil.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WebDriverUtil.IMPLICITLY_WAIT));
    }
}
