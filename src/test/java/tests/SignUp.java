package tests;

import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.SignUpPage;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SignUp extends BaseClass {

    @Test
    public void creatingAcc(){

        signUpPage.signupbtn.click();

        Set<String> windows = driver.getWindowHandles();
        List<String> windowl = new ArrayList<>(windows);
        driver.switchTo().window(windowl.get(1));

        Select s1 = new Select(signUpPage.titleopt);
        s1.selectByValue("MR");

        signUpPage.firstnamefield.sendKeys("Hiroshima Sasuke");

        signUpPage.lastnamefield.sendKeys("Itachi");

        Select s2 = new Select(signUpPage.countryopt);
        s2.selectByVisibleText("Japan ");

        signUpPage.dobfield.sendKeys("24/5/1988");

        signUpPage.dateimg.click();

        signUpPage.phnofield.sendKeys("6369740756");

        signUpPage.emailfield.sendKeys("hiroshimanagai@gmail.com");

        signUpPage.passfield.sendKeys("u4!vfj87G5tTJNx");

        signUpPage.conpassfield.sendKeys("u4!vfj87G5tTJNx");

        a.click(signUpPage.termscheckbox).perform();

        signUpPage.submitbtn.click();
    }
}
