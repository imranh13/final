import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static com.sun.javafx.tools.resource.DeployResource.Type.icon;

public class ATTPage extends Setup {

    @FindBy(css = "[viewBox=\"0 0 23 19\"]")
    WebElement shoppingcart;

    boolean shoppingcart() {
        return shoppingcart.isDisplayed();
    }

    @FindBy(xpath = "//span[@data-test-id=\"linkHeading0\"]")
    WebElement Dealslink;

    void Dealslink() {
        boolean Dealslink;

    }

    @FindBy(css = "[id=\"z1-search-tablet-text\"]")
    WebElement Search;

    boolean Search() {
        return Search.isEnabled();

    }

    @FindBy(css = "[id=\"z1-profile-open\"]")
    WebElement MyATT;

    void MyATT() {
        MyATT.click();
    }

    @FindBy(xpath = "//a [@class=\"jsx-2725997832 on-dark btn btn-primary-2 btn-arrow\"]")
    WebElement Shopallphonedeals;

    void Shopallphonedeals() {
        Shopallphonedeals.isDisplayed();
    }

    @FindBy(css = "class=\"HelpVideosAccess_linkStyle__Y1THj  link-text3\"]")
    WebElement Gotovideolibrary;

    @FindBy(css = "[class=\"text parbase section\"]")
    WebElement copyRight;


    @FindBy(xpath = "//span[@data-test-id=\"linkHeading4\"]")
    WebElement TV;



    boolean checkCopyRight(WebDriver dr1) {
        moveMouse(dr1, copyRight);
        boolean copy = copyRight.isDisplayed();
        return copy;

    }

    @FindBy(xpath = "//*[@id=\"z1-pullMenu-open\"]/span")
    WebElement Dropdown;

    void selectCategory() {
        selectDropdown(Dropdown, 10);

    }

    @FindBy(id = "z1-profile-text")
    WebElement attAccountButton;

    void clickAttButton() {
        attAccountButton.click();
    }

    @FindBy(css = "#profile-unauth > div.parsys.cta.section > ul > li:nth-child(4) > a > span")
    WebElement accountDropDown;

    void clickBillPay() {
        System.out.println(driver == null);
        driver.findElement(By.cssSelector("#profile-unauth > div.parsys.cta.section > ul > li:nth-child(4) > a > span")).click();
//        accountDropDown.click();
    }

    @FindBy(xpath = "//div[@id=\"HEADBAND0\"]/ul[1]/li[1]/span")
    List<WebElement> sisterSites;

    ArrayList<String> linkText() {
        ArrayList<String> text = new ArrayList<>();

        for (WebElement a : sisterSites) {
            text.add(a.getText());
        }
        return text;
    }

    @FindBy(xpath = "//*[@id=\"z1-searchfield\"]")
    WebElement searchbar;

    void iphone14promax() {
        searchbar.click();

    }

    @FindBy(xpath = "//i[@id=\"z1-globe-md\"]")

    WebElement logo;

    void logo() {
        logo.getText();
    }

    @FindBy(css = "class=\"z1-universal-nav-cta hide-xsm hide-sm\"")
    WebElement findastore;

    void findastore() {
        findastore.isEnabled();
    }

    @FindBy(xpath = "//input[@type=\"email\"]")
    WebElement email;

    boolean email() {
        return email.isDisplayed();
    }

    @FindBy(css = "[type=\"search\"]")
    WebElement Upgradeadevice;


    @FindBy(xpath = "//div[@id=\"z1-tier1Nav\"]/a[1]/span[1]")
    WebElement Business;

    @FindBy(css = "[id=\"HEADBAND02\"]")
    WebElement Internet;

    void Inernet() {
        Internet.getText();
    }

    @FindBy(css = "[style=\"background-size:cover\"]")
    WebElement Phone;

    void Phone() {
        Phone.getSize();
    }

    @FindBy(xpath = "//i[@class=\"icon-social-twitterL\"]")
    WebElement icon;

    void icon() {
        icon.isEnabled();
    }

    @FindBy(xpath = "//div[@id=\"z1-tier1Nav\"]/a[1]")
    WebElement feedback;

    @FindBy(xpath = "//att-wcgn-mp-comp[@class=\"z1-universal-nav-cta hide-xsm hide-sm hydrated\"]/a[1]")
    WebElement language;
@FindBy(xpath = "//*[@id=\"z5-ftr-col2\"]/div/div/div/ul/li[1]/a")
    WebElement newsroom;
void newsroom(){
    newsroom.isDisplayed();
}


@FindBy(xpath = "//*[@id=\"z1-tier1Nav\"]/a[5]/span")
WebElement tv;
void tv(){
    tv.click();
}


@FindBy(xpath = "//a[@title=\"Accessibility\"]")
    WebElement Accessibility;
void CheckAccessibility(){
    Accessibility.isDisplayed();
}

@FindBy(css = "[style=\"position:relative;z-index:4\"]")
    WebElement tablets;
void tablets(){
    tablets.isDisplayed();
}

@FindBy(xpath = "//*[@id=\"z5-footer-legal\"]/div/div/ul/li[1]/a")
    WebElement sitemap;
void checksitemap(){
    sitemap.isDisplayed();
}

@FindBy(css = "[class=\"_2xLj2 _3lhzb _1Jigv \"]")
    WebElement signin;
void signin(){
    signin.isDisplayed();
}

@FindBy(xpath = "//div[@id=\"z1-tier1Nav\"]/a[1]/span[1]")
    WebElement prepaid;
void prepaid(){
    prepaid.click();
}
@FindBy(xpath = "//div[@id=\"z1-tier1Nav\"]/a[1]/span[1]")
    WebElement wireless;
void wireless(){
    wireless.isEnabled();
}
@FindBy(xpath = "//a[@data-key=\"cta1\"]/span[1]")
    WebElement accessories;
void accessories(){
    accessories.isEnabled();
}
@FindBy(xpath = "//a[@data-key=\"cta1\"]/span[1]")
    WebElement internet;
void internet(){
    internet.click();
}
@FindBy(css = "[href=\"https://techbuzz.att.com\"]")
    WebElement techbuzzblog;

@FindBy(css = "[href=\"https://www.att.com/support/contact-us/\"]")
    WebElement contactus;
void contacus(){
    contactus.isDisplayed();
}
@FindBy(css = "[class=\"ge5p_hamburger_bar\"]")
    WebElement homephone;
void homephone(){
    homephone.getText();
}
@FindBy(css = "[class=\"ge5p_hamburger_bar\"]")
    WebElement bundles;
void bundles(){
    bundles.isDisplayed();
}
@FindBy(xpath = "//a[@id=\"z1-profile-open\"]")
    WebElement seemybill;

@FindBy(xpath = "//span[@id=\"z1-profile-text\"]")
    WebElement viewmyoders;

@FindBy(css = "[id=\"z1-profile-text\"]")
    WebElement gotomyfavorites;
void gotomyfavorites(){
    gotomyfavorites.getLocation();
}

@FindBy(css = "[id=\"z1-profile-text\"]")
    WebElement updatemyprofile;
void updatemyprofile(){
    updatemyprofile.hashCode();
}

@FindBy(css = "id=\"z1-profile-text\"]")
    WebElement gotomyaccount;
boolean Checkgotomyaccount(WebDriver driver1){
    moveMouse(driver1,gotomyaccount);
    boolean copy = gotomyaccount.isDisplayed();
    return copy;
}

@FindBy(xpath = "//span[@id=\"z1-profile-text\"]")
    WebElement paywithoutsigningin;
boolean paywithoutsigngin(WebDriver driver){
    moveMouse(driver,paywithoutsigningin);
  boolean copy = paywithoutsigningin.isEnabled();
  return copy;
}

@FindBy(css = "[class=\"at-element-marker\"]")
    WebElement shop;
void checkshop(){
    shop.getText();
}

@FindBy(css = "[href=\"https://att.jobs/\"]")
    WebElement careers;
void careers(){
    careers.isDisplayed();
}

@FindBy(css = "[href=\"https://www.att.com/coverage/\"]")
    WebElement coveragemaps;
void Checkcoveragemaps(){
    coveragemaps.isEnabled();
}
@FindBy(css = "[href=\"https://www.att.com/legal/terms.attWebsiteTermsOfUse.html\"]")
    WebElement termsofuse;
void termofuse(){
    termsofuse.toString();
}

@FindBy(css = "[class=\"text parbase section\"]")
    WebElement Allrightsreserved;
void CheckAllrightsreserved(){
    Allrightsreserved.hashCode();
}

@FindBy(xpath = "//i[@class=\"icon-social-facebookL\"]")
    WebElement facebook;
boolean facebook(WebDriver driver){
    moveMouse(driver,facebook);
    boolean copy = facebook.isDisplayed();
    return copy;
}
@FindBy(css = "[class=\"icon-social-linkedinL\"]")
    WebElement linkedin;
boolean linkedin(){
    moveMouse(driver,linkedin);
    boolean copy = linkedin.isEnabled();
    return copy;
}
@FindBy(css = "[class=\"icon-social-twitterL\"]")
    WebElement twitterl;
void twitterl(){
    twitterl.toString();
}
@FindBy(xpath = "//i[@class=\"icon-social-instagramL\"]")
    WebElement instagram;
void instagram(){
    instagram.isDisplayed();
}
@FindBy(css = "[href=\"https://publicfiles.fcc.gov/cable-system/999999-at&t-u-verse\"]")
    WebElement fccpublicfiles;
void fccpublicfiles(){
    fccpublicfiles.getRect();
}
@FindBy(xpath = "[href=\"https://about.att.com/csr/home/privacy/full_privacy_policy.html#choice\"]")
    WebElement Advertisingchoices;
void CheckAdvertisingchoices(){
    Advertisingchoices.isDisplayed();
}
@FindBy(xpath = "//a[@href=\"https://www.att.com/gen/public-affairs?pid=20879\"]")
WebElement Broadbanddetails;
void Broadbanddetails(){
    Broadbanddetails.hashCode();
}
;
@FindBy(css = "[href=\"https://www.att.com/storeappointment/\"]")
    WebElement Makeastoreappointment;
void Makeastoreappointment(){
    Makeastoreappointment.isDisplayed();
}
@FindBy(css = "[href=\"https://about.att.com/csr/home/privacy/rights_choices.html\"]")
    WebElement YourPrivacyChoices;
void CheckYourPrivacyChoices(){
    YourPrivacyChoices.toString();
}
@FindBy(css = "[class=\"text parbase section\"]")
    WebElement IntellectualProperty;
void IntellectualProperty(){
    IntellectualProperty.isDisplayed();
}
}







