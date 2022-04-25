import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
    private WebDriver driver = DriverSingleTon.getDriver();
    private WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

}
