package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static locatorContainers.CartPageContainer.cartProductIcon;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    private List<WebElement> getProducts(){
        return findAll(cartProductIcon);
    }

    public boolean checkIfProductAdded() {
        return getProducts().size() > 0 ;
    }


}
