package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightDetailsPage {

    private WebDriver driver;

    public FlightDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='check-in']")
    public WebElement checkinbtn;

    @FindBy(xpath = "//input[@maxlength='8']")
    public WebElement ticknofield;

    @FindBy(xpath = "//input[contains(@placeholder,'john.doe@spicejet.com')]")
    public WebElement emailfield;

    @FindBy(xpath = "//div[text()='Search Booking']")
    public WebElement searchbkbtn;

    @FindBy(xpath = "//div[contains(text(),'Unable')]")
    public WebElement alertnotify;

    @FindBy(xpath = "//div[text()='flight status']")
    public WebElement flightstsbtn;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement originfield;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement destiniorigin;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement flightnofield;

    @FindBy(xpath = "//div[contains(text(),'Search')]")
    public WebElement searchflightbtn;

    @FindBy(xpath = "//div[contains(text(),'Sorry')]")
    public WebElement alertele;

    @FindBy(xpath = "//div[contains(text(),'manage')]")
    public WebElement managebkbtn;
}
