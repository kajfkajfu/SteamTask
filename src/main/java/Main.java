import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverSingleTon.getDriver();
        driver.manage().window().maximize();
        driver.get("https://store.steampowered.com/search/?os=linux&filter=topsellers");
        TopSellersPage topSellersPage = new TopSellersPage();
        System.out.println(topSellersPage.getListOfGames().getSize().toString());
//        HomeSteamPage homeSteamPage = new HomeSteamPage();
//        homeSteamPage.moveToNewAndNoteworthyMenu();
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfAllElements(homeSteamPage.getTopSellersBtn()));
//        homeSteamPage.clickOnTopSellersBtn();
    }

    private static String getPlayersNumber(String str1) {
        String[] strings1 = str1.split("/n");
        return strings1[1];
    }
}
