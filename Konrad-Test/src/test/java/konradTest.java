import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobject.mainPage;

public class konradTest extends baseTest{
    @Test(priority = 1)
    @Parameters({"name", "email", "phone", "request"})
    public void makeReservation(String name, String email, String phone, String request) throws InterruptedException {
        mainPage main = new mainPage(baseURL, driver);
        main.makeReservation(name, email, phone, request);
        Assert.assertEquals(main.setSuccesfullMessage().isDisplayed(), true);
    }
}
