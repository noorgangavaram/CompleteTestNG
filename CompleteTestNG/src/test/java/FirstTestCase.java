import org.testng.annotations.Test;

public class FirstTestCase {
    @Test(priority = 1)
    public void setup(){
        System.out.println("openning browser ");
    }

    @Test(priority = 2)
    public void login(){
        System.out.println("this is login test");
    }

    @Test(priority = 3)
    public void closeBrewser(){
        System.out.println("this is setup test");
    }
}
