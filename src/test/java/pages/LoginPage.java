package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Login']")
    public WebElement tologinbtn;

    @FindBy(xpath = "//div[text()='Email']")
    public WebElement emailbtn;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailfield;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passfield;

    @FindBy(xpath = "//div[@data-testid='login-cta']")
    public WebElement loginbtn;

    @FindBy(xpath = "//div[contains(text(),'Sas')]")
    public WebElement profilebtn;

    @FindBy(xpath = "//div[contains(text(),'Invalid')]")
    public WebElement alertmsg;
}
