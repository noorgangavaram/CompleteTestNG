package ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest2 {
    WebDriver driver;

    @Test
    void loginTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://github.com/");

        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
    }

    @AfterTest
    void closebrowser(){
        driver.close();
    }
}
