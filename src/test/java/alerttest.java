import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class alerttest extends Setup{

    Alert alert;
    @BeforeMethod
    void setUpHome () {
        setupDriver("https://demoqa.com/alerts");
        alert = PageFactory. initElements (driver, Alert.class);

    }

    @Test
    void GetTitle() {
        System.out.println(driver.getTitle());
        Assert.assertTrue(true);
    }
    @Test
    void alerttest () {
        System.out.println(alert.GetText());

    }
}