import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StoreSteamPage {
    private final WebDriver driver = DriverSingleTon.getDriver();

    private WebElement storePageElement = driver.findElement(By.xpath("//div[@class=\"home_page_gutter\"]"));

    public WebElement getStorePageElement() {
        return storePageElement;
    }
}
