package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

    private WebDriver driver;

    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Signup']")
    public WebElement signupbtn;

    @FindBy(xpath = "(//select[contains(@class,'form-control')])[1]")
    public WebElement titleopt;

    @FindBy(id = "first_name")
    public WebElement firstnamefield;

    @FindBy(id = "last_name")
    public WebElement lastnamefield;

    @FindBy(xpath = "(//select[contains(@class,'form-control')])[2]")
    public WebElement countryopt;

    @FindBy(id = "dobDate")
    public WebElement dobfield;

    @FindBy(xpath = "//img[@alt='date']")
    public WebElement dateimg;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phnofield;

    @FindBy(id = "email_id")
    public WebElement emailfield;

    @FindBy(id = "new-password")
    public WebElement passfield;

    @FindBy(id = "c-password")
    public WebElement conpassfield;

    @FindBy(id = "defaultCheck1")
    public WebElement termscheckbox;

    @FindBy(xpath = "//button[@type='button']")
    public WebElement submitbtn;
}
