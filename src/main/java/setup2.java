import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class setup2 {
    WebDriver driver;
    WebDriver driver2;

    void setupDriver(String url ){
            System.setProperty("webdriver.chrome.driver","resources/chromedriver");
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
           driver  = new ChromeDriver(options);
            driver.get(url);

//        WebDriver driver = new ChromeDriver();
        WebDriver driver2 = new ChromeDriver();



    }

    void selectDropdown(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    void moveMouse(WebDriver dr, WebElement element){
        Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
    }



    }




