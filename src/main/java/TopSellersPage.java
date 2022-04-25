import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopSellersPage {
    private final WebDriver driver = DriverSingleTon.getDriver();
    private WebElement uniqueElement = driver.findElement(By.xpath("//*[@class=\"pageheader full\"]"));
    private WebElement steamOSLinuxBtn = driver.findElement(By.xpath("//span[@class=\"tab_filter_control tab_filter_control_include\"]"));
    private WebElement listOfGames = driver.findElement(By.xpath("//div[@id=\"search_resultsRows\"]"));

    public String getUniqueElementText() {
        return uniqueElement.getText().trim();
    }

    public void clickOnSteamOSLinuxBtn() {
        steamOSLinuxBtn.click();
    }

    public WebElement getListOfGames() {
        return listOfGames;
    }
}
