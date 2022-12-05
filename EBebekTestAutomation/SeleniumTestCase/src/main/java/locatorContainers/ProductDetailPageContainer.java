package locatorContainers;

import org.openqa.selenium.By;

public class ProductDetailPageContainer {
    public static By productDetailsTabButton = By.id("btnProductDetailsTab");
    public static By productAddedToCartInfo = By.xpath("//p[text()=\" Ürün Sepetinizde \"]");
    public static By addToCartButton = By.id("addToCartBtn");
    public static By goToCartButton = By.id("btnShowCart");
}
