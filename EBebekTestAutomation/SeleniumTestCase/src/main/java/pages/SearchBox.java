package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static locatorContainers.SearchBoxContainer.searchBoxLocator;

public class SearchBox extends BasePage {
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        WebElement searchBox = driver.findElement(searchBoxLocator);
        isDisplayed(searchBoxLocator);
        click(searchBoxLocator);
        type(searchBoxLocator, text);
        searchBox.sendKeys(Keys.ENTER);
    }
}
