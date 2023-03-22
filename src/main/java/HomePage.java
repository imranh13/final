import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HomePage extends Setup{


    @FindBy(css = ".deal-of-the-day div h2")
    WebElement deals;

    @FindBy(xpath = "//a[@data-csa-c-content-id=\"nav_cs_amazonbasics\"]")
    WebElement amazonBasics;

    @FindBy(xpath = "//div[@id='nav-xshop-container']/div/a")
    List<WebElement> headerLinks;

    @FindBy(css = "[id=\"nav-link-accountList-nav-line-1\"]")
    WebElement accountText;

    @FindBy(css = "h1[class='a-spacing-small']")
    WebElement signIn;

    @FindBy(id = "searchDropdownBox")
    WebElement category;

    @FindBy(css = "div.nav-logo-base")
    WebElement footerLogo;

    @FindBy(css = ".navFooterCopyright span")
    WebElement copyRight;

    @FindBy(id = "desktop-grid-1")
    WebElement productGrid;

    @FindBy(xpath = "//table[@class='navFooterMoreOnAmazon']/tbody/tr/td")
    List<WebElement> sisterSites;

    @FindBy(xpath = "//div[@class=\"navFooterVerticalColumn navAccessibility\"]/div/div/ul/li/a")
    List<WebElement> helperLinks;

    String dealsText(){
        return deals.getText();
    }

    void clickAmazonBasics(){
        amazonBasics.click();
    }

    ArrayList<String> headerText(){

        ArrayList<String> links = new ArrayList<>();
        for(WebElement a : headerLinks){
           links.add(a.getText());
        }

        System.out.println(links);
        return links;
    }

    String accountText(){
      return  accountText.getText();
    }

    void loginPage(){
       accountText.click();
    }

    boolean logInCheck(){
        return signIn.isDisplayed();
    }

    String signInText(){
        return signIn.getText();
    }


    void selectCategory(){
        selectDropdown(category, 3);
    }

    boolean checkCopyRight(WebDriver dr1){
        moveMouse(dr1, copyRight);
        boolean copy =  copyRight.isDisplayed();
        return copy;
    }

    String copyRightText(WebDriver dr1){
        moveMouse(dr1, copyRight);
        return copyRight.getText();
    }

    void productGridClick(WebDriver dr){
        doubleClick(dr, productGrid);
    }

    ArrayList<String> linkText(){
        ArrayList<String> text = new ArrayList<>();

        for(WebElement a : sisterSites) {
            text.add(a.getText());
        }

        return text;
    }

    void clickLinks(){
        for(WebElement a : sisterSites){
            a.click();
            driver.navigate().to("https://amazon.com");
        }
    }

    void clickHelperLinks(WebDriver dr) {
        for (WebElement a: helperLinks) {
            a.click();
            waitForVisibility(dr, 10, a);
            driver.navigate().to("https://amazon.com");
        }
    }
}
