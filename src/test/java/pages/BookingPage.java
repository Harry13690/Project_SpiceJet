package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {

    private WebDriver driver;

    public BookingPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement firstnamefield;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement lastnamefield;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement phnofield;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement emailfield;

    @FindBy(xpath = "(//input[@type='text'])[6]")
    public WebElement passfirstnamefield;

    @FindBy(xpath = "(//input[@type='text'])[7]")
    public WebElement passlastnamefield;

    @FindBy(xpath = "//div[text()='Continue']")
    public WebElement continuebtn1;

    @FindBy(xpath = "(//div[text()='Continue'])[3]")
    public WebElement continuebtn2;

    @FindBy(xpath = "(//img[contains(@src,'image/png')])[1]")
    public WebElement notifyXbtn;

    @FindBy(id = "card_number")
    public WebElement cardnofield;

    @FindBy(id = "name_on_card")
    public WebElement cardnamefield;

    @FindBy(id = "card_exp_month")
    public WebElement expmonfield;

    @FindBy(xpath = "card_exp_year")
    public WebElement expyrfield;

    @FindBy(xpath = "security_code")
    public WebElement cvvfield;

    @FindBy(xpath = "//div[contains(text(),'Proceed')]")
    public WebElement continuebtn3;
}

