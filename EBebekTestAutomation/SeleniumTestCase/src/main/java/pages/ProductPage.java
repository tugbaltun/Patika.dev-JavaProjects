package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static locatorContainers.ProductPageContainer.categoryFilter;
import static locatorContainers.ProductPageContainer.productFrame;

public class ProductPage extends BasePage{

    public ProductPage(WebDriver driver) {

        super(driver);
    }

    public boolean isOnProductPage() {
        return isDisplayed(categoryFilter);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productFrame);
    }
}
