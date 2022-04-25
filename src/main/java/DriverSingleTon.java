import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverSingleTon {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions o= new ChromeOptions();
            o.addArguments("--incognito");
            DesiredCapabilities c = DesiredCapabilities.chrome();
            c.setCapability(ChromeOptions.CAPABILITY, o);
            driver = new ChromeDriver(o);
        }
        return driver;
    }
}
