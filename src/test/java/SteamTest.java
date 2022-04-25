import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

public class SteamTest {
    private WebDriver webDriver;
    private HomeSteamPage homeSteamPage;
    private AboutSteamPage aboutSteamPage;
    private StoreSteamPage storeSteamPage;
    private TopSellersPage topSellersPage;


    @BeforeTest
    private void before_method() {
        webDriver = DriverSingleTon.getDriver();
        webDriver.manage().window().maximize();
    }

    @AfterTest
    private void after_method() {
//        webDriver.quit();
    }

    @Test
    private void testCase1() {
        webDriver.get("https://store.steampowered.com");
        homeSteamPage = new HomeSteamPage();
        Assert.assertEquals(homeSteamPage.getHomePageElement().getAttribute("class"), "home_page_gutter");
        homeSteamPage.clickOnAboutBtn();
        aboutSteamPage = new AboutSteamPage();
        String online = getPlayersNumber(aboutSteamPage.getGamersOnlineElement().getText());
        String inGame = getPlayersNumber(aboutSteamPage.getGamersInGameElement().getText());
        Assert.assertTrue(Integer.parseInt(online) > Integer.parseInt(inGame));
        aboutSteamPage.clickOnStoreBtn();
        storeSteamPage = new StoreSteamPage();
        Assert.assertEquals(storeSteamPage.getStorePageElement().getAttribute("class"), "home_page_gutter");
    }

    @Test
    private void testCase2() {
        webDriver.get("https://store.steampowered.com");
        homeSteamPage = new HomeSteamPage();
        Assert.assertEquals(homeSteamPage.getHomePageElement().getAttribute("class"), "home_page_gutter");
        homeSteamPage.moveToNewAndNoteworthyMenu();
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElements(homeSteamPage.getTopSellersBtn()));
        homeSteamPage.clickOnTopSellersBtn();
        topSellersPage = new TopSellersPage();
        Assert.assertEquals(topSellersPage.getUniqueElementText(), "TOP SELLERS");
        topSellersPage.clickOnSteamOSLinuxBtn();

    }

    private String getPlayersNumber(String str1) {
        String[] strings1 = str1.split("\n");
        return strings1[1].replaceAll(",", "");
    }
}
