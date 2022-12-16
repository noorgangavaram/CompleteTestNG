import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotaitonsExamples {



    @BeforeClass
    void beforeclass(){
        System.out.println("this is the starting of class");
    }
    @BeforeMethod
    void beforemethod(){
        System.out.println("This will excute before every Method");
    }
    @Test
    void test1(){
        System.out.println("This is test 1....");
    }
    @Test
    void test2(){
        System.out.println("This is test 2...");
    }
    @AfterMethod
    void aftermethod(){
        System.out.println("This will excute after every method");
    }
    @AfterClass
    void afterclass(){
        System.out.println("This is the ending of class");
    }

    @BeforeTest
    void beforetest(){
        System.out.println("This will excute before the Test");
    }

    @AfterTest
    void aftertest(){
        System.out.println("this will excute after the test case");
    }



}
