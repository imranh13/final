import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HomeTest extends Setup{

    //go to amazon.com
    //check 'Top Deal' box at the bottom of the screen or scroll down till it's visible

    //expected result : title text will exactly match 'Top Deal'

    //checking / validating the expected result // comparing actual & expected result

    HomePage home;

    @AfterMethod
    void closeBrowser() throws InterruptedException {
        quitBrowser();
    }

    @BeforeMethod
    void setUpTest(){
        setupDriver("https://amazon.com");
        home  = PageFactory.initElements(driver, HomePage.class);
    }

   @Test(priority = 4, groups = "deal")
    void testDeals(){
        //BeforeMethod
       String actualText =  home.dealsText();
       Assert.assertEquals(actualText, "Top Deal");

    }

    @Test(priority = 3, groups = "deal")
    void  testBasics(){
        home.clickAmazonBasics();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals( actualUrl, "https://www.amazon.com/stores/node/20648519011?channel=discovbar?field-lbr_brands_browse-bin=AmazonBasics&ref_=nav_cs_amazonbasics");

    }

    @Test
    void testHeaderLinks(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Today's Deals");
        expected.add("Music");
        expected.add("Books");
        expected.add("Registry");

        ArrayList<String> actual = home.headerText();

        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 2, groups = "home")
    void validateAccount(){
       String actualText = home.accountText();
       Assert.assertEquals( actualText, "Account, Sign in");
    }

    @Test(priority = 0)
    void validateSignIn(){
        home.loginPage();
        Assert.assertTrue(home.logInCheck());
//        Assert.assertFalse(home.logInCheck());
    }


    @Test(priority = 1)
    void testSignInText(){
        home.loginPage();
        String actual = home.signInText();

        Assert.assertEquals(actual, "Log in");
    }


    @Test
    void validateCategory() throws InterruptedException {
        home.selectCategory();
        Thread.sleep(10000);
    }

     @Test
    void validateCopyRight() throws InterruptedException {
        boolean a = home.checkCopyRight(driver);
        Assert.assertTrue(a);
        Thread.sleep(5000);
     }

     @Test
    void validateCopyRightText(){
        Assert.assertTrue(home.copyRightText(driver).contains("2023"));
     }

     @Test
    void validateProductGrid(){
        home.productGridClick(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("B09N6F9NV3"));
//        Assert.assertFalse(driver.getCurrentUrl().equals("https://amazon.com"));
     }

     @Test
     void validateNumberOfLinks(){
        int number = home.linkText().size();
        Assert.assertEquals(number, 71);
     }

     @Test
    void validateIndividualLinks(){
        ArrayList<String> links = home.linkText();
        System.out.println(links);
        Assert.assertTrue(links.contains("Zappos\n" +
                "Shoes &\n" +
                "Clothing"));
    }

    @Test
    void clickFooter(){
        home.clickLinks();
    }

    @Test
    void clickHelper(){
        home.clickHelperLinks(driver);
    }
}
