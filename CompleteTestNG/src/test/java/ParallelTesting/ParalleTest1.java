package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ParalleTest1 {

    WebDriver driver;

    @Test
    void logoTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
        Assert.assertTrue(logo.isDisplayed()," Logo is not present in the page");
        Thread.sleep(5000);
    }

    @Test
    void homePageTitleTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String title = driver.getTitle();
        Assert.assertEquals("OrangeHRM",title,"Title is not matched");
        Thread.sleep(5000);

    }

    @AfterTest
    void closeBrowser(){
        driver.close();
    }
}
