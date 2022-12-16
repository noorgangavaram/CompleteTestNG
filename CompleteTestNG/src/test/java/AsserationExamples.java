import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AsserationExamples {

    WebDriver driver;

    @BeforeClass
    void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    void logoTest(){
       WebElement logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
        Assert.assertTrue(logo.isDisplayed()," Logo is not present in the page");
    }

    @Test(priority = 2)
    void homepageTitle(){
       String title = driver.getTitle();
       Assert.assertEquals("OrangeHRM",title,"Title is not matched");
    }

    @AfterClass
    void closeBrowser(){
        driver.close();
    }

}
