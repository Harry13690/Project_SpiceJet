package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import org.apache.commons.io.FileUtils;

public class BaseClass {

    public static WebDriver driver;
    public Actions a;
    public SignUpPage signUpPage;
    public LoginPage loginPage;
    public SearchFlightPage searchFlightPage;
    public BookingPage bookingPage;
    public FlightDetailsPage flightDetailsPage;

    @Parameters("browser")
    @BeforeClass
    public void setUp(String browser){

        if (browser.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--disable-notifications");
            driver = new FirefoxDriver(options);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.spicejet.com/");
        a = new Actions(driver);
        signUpPage = new SignUpPage(driver);
        loginPage = new LoginPage(driver);
        searchFlightPage = new SearchFlightPage(driver);
        bookingPage = new BookingPage(driver);
        flightDetailsPage = new FlightDetailsPage(driver);
    }

    @AfterClass
    public void tearDown(){

        driver.quit();
    }

    public static String takeScreenshot(String testCaseName){
        TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

        File destinationFile = new File("report/screenshots/"+ testCaseName + ".png");
        try {
            FileUtils.copyFile(srcFile,destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String path = "<img src = " + destinationFile.getAbsolutePath() + "width = 200px height = 200px/>";
        Reporter.log(path);
        return destinationFile.getAbsolutePath();
    }
}
