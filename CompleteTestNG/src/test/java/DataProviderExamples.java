import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExamples {

    //This method is getting the data from data provider method
    //Now we are getting the data from the another class called CustomDataProvider
    @Test(dataProvider = "LoginDataProvider",dataProviderClass = CustomDataProvider.class)
    public void loginTest(String email ,String password){
        System.out.println("Your email is : "+email+ "  and your password is : "+password);
    }

}
