import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomeSteamPage {
    private final WebDriver driver = DriverSingleTon.getDriver();
    private final WebElement homePageElement = driver.findElement(By.xpath("//div[@class=\"home_page_gutter\"]"));
    private final WebElement aboutBtn = driver.findElement(By.xpath("//a[@class=\"menuitem\"][contains(text(),\"ABOUT\")]"));
    private final WebElement newAndNoteworthyMenu = driver.findElement(By.xpath("//a[@class=\"pulldown_desktop\"][contains(text(),\"New & Noteworthy\")]"));
    private final WebElement topSellersBtn = driver.findElement(By.xpath("//a[@class=\"popup_menu_item\"][contains(text(),\"Top\")]"));
    private final Actions actions = new Actions(driver);


    public void clickOnAboutBtn() {
        aboutBtn.click();
    }

    //delete
    public WebElement getHomePageElement() {
        return homePageElement;
    }

    public WebElement getNewAndNoteworthyMenu() {
        return newAndNoteworthyMenu;
    }

    public void clickOnTopSellersBtn() {
        topSellersBtn.click();
    }

    public WebElement getTopSellersBtn() {
        return topSellersBtn;
    }

    public void moveToNewAndNoteworthyMenu() {
       actions.moveToElement(newAndNoteworthyMenu).build().perform();
    }
}
