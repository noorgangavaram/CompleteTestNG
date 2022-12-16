import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    //This method is called data provider method
    @DataProvider(name="LoginDataProvider")
    public Object[][] getdata(){
        Object[][] data = {{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
        return data;
    }
}
