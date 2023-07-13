package APITest;

import org.testng.annotations.Test;

public class APIController {

    @Test(priority = 1, description = "Retrieve GBP price")
    public void GBPPrice(){
        APIService.getGBPPrice();
    }
}
