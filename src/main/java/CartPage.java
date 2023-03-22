import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.Text;

public class CartPage {

    @FindBy(xpath = "//a[@id=\"a-autoid-1-announce\"]/span")
    WebElement signInButton;

    @FindBy(css = ".sc-your-amazon-cart-is-empty h2")
    WebElement emptyCart;

    String textSignInButton(){
      String text =  signInButton.getText();
      return text;
    }

    boolean emptyCart(){
        return emptyCart.isDisplayed();
    }
}
