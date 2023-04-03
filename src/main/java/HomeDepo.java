import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeDepo extends Setup{

    @FindBy(xpath = "//div[@class=\"MessageBarText u__normal\"]")
    WebElement productGrid;
    private WebElement CreditServices;

    void productGridClick(WebDriver dr){
        doubleClick(dr ,productGrid);

    }
    @FindBy(css = "[alt=\"HDX\"]")
    static
    WebElement HDX;
    void CheckHDX(WebDriver dr ) {
        doubleClick(dr, HDX);

    }

}
