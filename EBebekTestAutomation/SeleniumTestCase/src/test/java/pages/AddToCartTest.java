package pages;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AddToCartTest extends BaseTest{
    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void searchProduct(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.searchBox().search("biberon");
        Assertions.assertTrue(productPage.isOnProductPage() ,"Not on products page!");
    }

    @Test
    @Order(2)
    public void selectAProduct(){
        productDetailPage = new ProductDetailPage(driver);
        productPage.selectProduct(0);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");
    }

    @Test
    @Order(3)
    public void addProductToCart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(productDetailPage.isOnProductAddedToCart(),
                "Not on product added to cart information page!");
    }

    @Test
    @Order(4)
    public void goToCart(){
        cartPage = new CartPage(driver);
        productDetailPage.goToCartPage();
        Assertions.assertTrue(cartPage.checkIfProductAdded() ,
                "Product was not added to cart!");
    }

}
