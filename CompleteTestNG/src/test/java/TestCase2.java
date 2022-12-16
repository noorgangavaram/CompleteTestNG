import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestCase2 {

    @Test
    void test3(){
        System.out.println("This is test 3...");
    }

    @Test
    void test4(){
        System.out.println("This is test 4...");
    }

    @BeforeSuite
    void bdforesuite(){
        System.out.println("This will excute before the suite");
    }

    @AfterSuite
    void aftersuite(){
        System.out.println("This will excute after the suite");
    }
}
