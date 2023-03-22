import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PageHelper {

    void moveMouse(WebDriver dr, WebElement element){
        Actions actions = new Actions(dr);
        actions.moveToElement(element).perform();
    }
}
