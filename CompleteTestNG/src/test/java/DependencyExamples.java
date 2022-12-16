import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExamples {

    @Test
    void startcar(){
        System.out.println("Car started");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startcar"})
    void drivecar(){
        System.out.println("Car driving");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"drivecar"})
    void stopcar(){
        System.out.println("Stop car");
    }

    @Test(dependsOnMethods = {"drivecar","stopcar"},alwaysRun = true)
    void parkcar(){
        System.out.println("car parked");
    }

}
