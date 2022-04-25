import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutSteamPage {
    private final WebDriver driver = DriverSingleTon.getDriver();

    private WebElement gamersOnlineElement = driver.findElement(By.xpath("//div[@class=\"online_stat\"][1]"));
    private WebElement gamersInGameElement = driver.findElement(By.xpath("//div[@class=\"online_stat\"][2]"));
    private WebElement storeBtn = driver.findElement(By.xpath("//a[@class=\"menuitem supernav\"][contains(text(),\"STORE\")]"));

    public void clickOnStoreBtn() {
        storeBtn.click();
    }

    public WebElement getGamersOnlineElement() {
        return gamersOnlineElement;
    }

    public WebElement getGamersInGameElement() {
        return gamersInGameElement;
    }
}
