import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class amazontest extends Setup {
    HomePage home;

    @AfterMethod
    void closeBrowser() throws InterruptedException {
        quitBrowser();
    }

    @BeforeMethod
    void setUpTest() {
        setupDriver("https://amazon.com");
        home = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    void validateCategory() throws InterruptedException {
        home.selectCategory();
        Thread.sleep(3000);
    }

    @Test
    void validateCopyRight() throws InterruptedException {
        boolean a = home.checkCopyRight(driver);
        Assert.assertTrue(a);
        Thread.sleep(2000);
    }


}
