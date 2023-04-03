import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeDepotest extends Setup {

    HomeDepo homeDepo;

    @BeforeMethod
    void setUpTest() {
        setupDriver("https://homedepot.com/");
        homeDepo = PageFactory.initElements(driver, HomeDepo.class);
    }

    @Test
    void vaildProductGrid() throws InterruptedException {
        Assert.assertFalse(driver.getCurrentUrl().equals("https://homedepot.com"));
        Thread.sleep(5000);
    }

    @Test
    void CheckHDX() {
        doubleClick(driver, HomeDepo.HDX);
        String actualUrl = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(04, TimeUnit.SECONDS);
    }

}
