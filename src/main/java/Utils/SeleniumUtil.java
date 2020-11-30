package Utils;

import base.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.io.IOException;
import java.util.List;

public class SeleniumUtil {

    public static Actions actions;

    public static void goToPage() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    public WebElement findElement(By locator) {
        return Driver.getDriver().findElement(locator);
    }

    public void click(By locator) {
        findElement(locator).click();
    }

    public void clear(By locator) {
        findElement(locator).clear();
    }

    public void sendKeys(By locator, String text) {
        findElement(locator).clear();
        findElement(locator).sendKeys(text);
    }

    public void getText(By locator) {
        findElement(locator).getText();
    }

    public void isDisplayed(By locator) {
        findElement(locator).isDisplayed();
    }

    public List<WebElement> findElements(By locator) {
        return Driver.getDriver().findElements(locator);
    }

    public static Actions getActions() {
        return actions = new Actions(Driver.getDriver());
    }

    public static String getUrl() {
        return Driver.getDriver().getCurrentUrl();
    }


}




