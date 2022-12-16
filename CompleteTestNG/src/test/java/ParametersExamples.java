import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExamples {
    WebDriver driver;

    @BeforeClass
    @Parameters({"Browser","URL"})
    void setup(String browser,String app)
    {
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\ADMIN\\Downloads\\geckodriver-v0.32.0-win-aarch64");
            driver = new FirefoxDriver();
        }
        driver.get(app);
    }
/*
    @Test(priority = 1)
    void logoTest(){
        WebElement logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
        Assert.assertTrue(logo.isDisplayed()," Logo is not present in the page");
    }
 */

    @Test(priority = 1)
    void homepageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM",title,"Title is not matched");
    }

    @AfterClass
    void closeBrowser(){
        driver.close();
    }
}
