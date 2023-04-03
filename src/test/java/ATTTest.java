import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ATTTest extends Setup {

    ATTPage attHome;

    @BeforeMethod
    void setUpTest() {

        setupDriver("https://att.com");

        attHome = PageFactory.initElements(driver, ATTPage.class);
    }
@AfterMethod
void quite() throws InterruptedException {
        quitBrowser();
}
    @Test
    void shoppingcart() {
        attHome.shoppingcart();
        Assert.assertTrue(attHome.shoppingcart());

    }

    @Test
    void Dealslink() {
        attHome.Dealslink();

    }

    @Test
    void Search() {
        attHome.Search();
        Assert.assertTrue(attHome.Search());
    }

    @Test
    void MyATT() {
        attHome.MyATT();
    }

    @Test
    void CheckShopallphonedeals() {
        attHome.Shopallphonedeals();

    }

    @Test
    void gotovideolibrary() {
        attHome.Gotovideolibrary.isEnabled();

    }

    @Test
    void TV() {
        attHome.TV.click();
    }

    @Test
    void validateCopyRight() throws InterruptedException {
        boolean a = attHome.copyRight.isDisplayed();
        Assert.assertTrue(a);
        Thread.sleep(5000);
    }

    @Test
    void validateCategory() throws InterruptedException {
        attHome.selectCategory();
        Thread.sleep(10000);
    }


    @Test
    void clickATTBillPayDropDown() throws InterruptedException {
        attHome.clickAttButton();
        Thread.sleep(2000);
        attHome.clickBillPay();
    }

    @Test
    void clickfooter() {
        attHome.sisterSites.clear();
    }

    @Test
    void checkiphone14promax() throws InterruptedException {
        attHome.searchbar.click();
    }

    @Test
    void logo() {
        attHome.logo.getText();
    }

    @Test
    void findastore() {
        attHome.findastore.isEnabled();
    }

    @Test
    void email() {
        attHome.email.isDisplayed();

    }

    @Test
    void validDropdown() {
        attHome.selectCategory();

    }

    @Test
    void Upgradeadivice() {
        attHome.Upgradeadevice.click();
    }

    @Test
    void Business() {
        attHome.Business.isEnabled();
    }

    @Test
    void CheckInternet() {
        attHome.Internet.getText();
    }

    @Test
    void CheckPhone() {
        attHome.Phone.getSize();
    }

    @Test
    void icon() {
        attHome.icon.isEnabled();
    }


    @Test
    void feedback() {
        attHome.feedback.click();

    }

    @Test
    void language() {
        attHome.language.getText();
    }

    @Test
    void Checknewsroom() {
        attHome.newsroom.isDisplayed();
    }

    @Test
    void Checktv() {
        attHome.tv.click();
    }

    @Test
    void vlaidAccessibility() {
        attHome.Accessibility.isDisplayed();
    }

    @Test
    void vlaidtablets() {
        attHome.tablets.isDisplayed();
    }

    @Test
    void vlaidsitemap() {
        attHome.sitemap.isDisplayed();
    }

    @Test
    void signin() {
        attHome.signin.isDisplayed();

    }

    @Test
    void Checkprepaid() {
        attHome.prepaid.click();
    }

    @Test
    void Checkwireless() {
        attHome.wireless.isDisplayed();
    }

    @Test
    void Checkaccessories() {
        attHome.accessories.isEnabled();
    }

    @Test
    void internet() {
        attHome.internet.click();
    }

    @Test
    void techbuzzblog() {
        attHome.techbuzzblog.isEnabled();
    }

    @Test
    void Checkcontackus() {
        attHome.contactus.isDisplayed();
    }

    @Test
    void homephone() {
        attHome.homephone.getText();
    }

    @Test
    void bundles() {
        attHome.bundles.isDisplayed();
    }

    @Test
    void seemybill() {
        attHome.seemybill.click();
    }

    @Test
    void viewmyoders() {
        attHome.viewmyoders.getRect();
    }

    @Test
    void gotomyfavorites() {
        attHome.gotomyfavorites.getLocation();
    }

    @Test
    void updatemyprofile() {
        attHome.updatemyprofile.hashCode();
    }

    @Test
    void validgotomyaccount() {
        Assert.assertTrue(attHome.gotomyfavorites.isDisplayed());
    }

    @Test
    void validpaywithoutsigningin() {
        Assert.assertTrue(attHome.paywithoutsigningin.isEnabled());
    }

    @Test
    void validshop() {
        attHome.shop.getText();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @Test
    void validcareers() {
        attHome.careers.isDisplayed();
    }

    @Test
    void validecoveragemaps() {
        attHome.coveragemaps.isEnabled();
    }

    @Test
    void termsofuse() {
        attHome.termsofuse.toString();
    }

    @Test
    void Allrightsreserved() {
        attHome.Allrightsreserved.hashCode();
    }

    @Test
    void validfacebook() {
        Assert.assertTrue(attHome.facebook.isDisplayed());
    }

    @Test
    void linkedin() {
        Assert.assertTrue(attHome.linkedin.isEnabled());
    }

    @Test
    void twitterl() {
        attHome.twitterl.toString();
    }

    @Test
    void instagram() {
        attHome.instagram.isDisplayed();
    }

    @Test
    void fccpublicfiles() {
        attHome.fccpublicfiles.getRect();
    }

    @Test
    void Advertisingchoices() {
        attHome.Advertisingchoices.isDisplayed();
    }

    @Test
    void Broadbanddetails() {
        attHome.Broadbanddetails.hashCode();
    }

    @Test
    void Makeastoreappointment() {
        attHome.Makeastoreappointment.isDisplayed();
    }
    @Test
    void YourPrivacyChoices(){
        attHome.YourPrivacyChoices.toString();
    }
@Test
    void IntellectualProperty(){
        attHome.IntellectualProperty.isDisplayed();
}

}














