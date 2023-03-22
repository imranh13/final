import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Setup {

    WebDriver driver;

    Actions actions;
//    WebDriver driver1;
//
//    WebDriver driver2;

    void setupDriver(String url){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        driver = new ChromeDriver();
//        driver1 = new FirefoxDriver();
//        driver2 = new SafariDriver();
        driver.get(url);
    }

    void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


    void selectDropdown(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }


   void moveMouse(WebDriver dr, WebElement element){
        Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
   }

   void doubleClick(WebDriver dr, WebElement element){
        Actions actions = new Actions(dr);
        actions.doubleClick(element).perform();
   }

   private void action1(WebDriver dr){
       actions = new Actions(dr);
   }

   void rightClick(WebDriver dr, WebElement element){
        action1(dr);
        actions.contextClick(element).perform();

   }

   void waitForVisibility(WebDriver dr, int time, WebElement element){
       WebDriverWait wait = new WebDriverWait(dr, time);
       wait.until(ExpectedConditions.visibilityOf(element));
   }


    void waitForClickable(WebDriver dr, int time, WebElement element){
        WebDriverWait wait = new WebDriverWait(dr, time);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
