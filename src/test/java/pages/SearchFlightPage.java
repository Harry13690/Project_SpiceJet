package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFlightPage {

    private WebDriver driver;

    public SearchFlightPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='one way']")
    public WebElement onewaybtn;

    @FindBy(xpath = "//div[text()='round trip']")
    public WebElement roundwaybtn;

    @FindBy(xpath = "(//input[@spellcheck='false'])[1]")
    public WebElement fromfield;

    @FindBy(xpath = "(//input[@spellcheck='false'])[2]")
    public WebElement tofield;

    @FindBy(xpath = "//div[text()='31']")
    public WebElement deperaturedate;

    @FindBy(xpath = "//div[text()='Select Date']")
    public WebElement returndatebtn;

    @FindBy(xpath = "//div[text()='31']")
    public WebElement returndate;

    @FindBy(xpath = "//div[@data-testid='home-page-flight-cta']")
    public WebElement searchbtn;

    @FindBy(xpath = "//div[text()='Flight Details']")
    public WebElement verifyele;

    @FindBy(xpath = "//div[contains(@data-testid,'continue')]")
    public WebElement continuebtn;
}
