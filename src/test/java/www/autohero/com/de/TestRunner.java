package www.autohero.com.de;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import www.autohero.com.de.additional.AutomationLogger;
import www.autohero.com.de.additional.GeckoDriver;
import www.autohero.com.de.pageobjects.MainObject;

import java.io.File;

/**
 * This class need for run test.
 */
public class TestRunner {

    private static final String URL = "https://www.autohero.com/de/search/";

    private WebDriver driver = null;

    @BeforeTest
    public void init() {
        String pathToGecko = GeckoDriver.getPathToGeckoService();
        if (pathToGecko != null) {
            System.setProperty("webdriver.gecko.driver", pathToGecko);
            //  driver = new FirefoxDriver();

            File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox\\Firefox.exe");
            FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
            FirefoxProfile firefoxProfile = new FirefoxProfile();
            driver = new FirefoxDriver(ffBinary, firefoxProfile);

        } else {
            AutomationLogger.printFailed("Test can not be execute, because missed gecko service file");
        }
    }

    @Test
    public void test() {
        MainObject mainObject = new MainObject(driver, URL);
        mainObject.get().setActionErweiterteSuche().setRangeFrom2009Till2014().setActionErgebnisse().setFilter("Höchster Preis")
                .validateOFSearch("2009",
                        "2014").validateResultOfSearch(2009, 2014);
    }

    @AfterTest
    public void closeConnection() {
        driver.close();
    }

}
