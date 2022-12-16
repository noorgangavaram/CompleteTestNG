import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    public void serchCustomer(){
        System.out.println("this is serchCustomer test case");
    }

    @Test(priority = 2)
    public void addCustomer(){
        System.out.println("this is addCustomer test case");
    }
}
