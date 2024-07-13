package tests;

import base.BaseClass;
import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends BaseClass {

    @Test(priority = 4)
    public void validLogin(){

        driver.get("https://www.spicejet.com/");

        loginPage.tologinbtn.click();

        loginPage.emailbtn.click();

        loginPage.emailfield.sendKeys("hiroshimanagasaki@gmail.com");

        loginPage.passfield.sendKeys("u4!vfj87G5tTJNx");

        loginPage.loginbtn.click();

        Assert.assertEquals(loginPage.profilebtn.getText(), "Hi Hiroshima Sasuke");
    }

    @Test(priority = 2)
    public void invalidLogin1(){

        driver.get("https://www.spicejet.com/");

        loginPage.tologinbtn.click();

        loginPage.emailbtn.click();

        loginPage.emailfield.sendKeys("spicejet@gmail.com");

        loginPage.passfield.sendKeys("u4!vfj87G5tTJNx");

        loginPage.loginbtn.click();

        Assert.assertEquals(loginPage.alertmsg.getText(), "Invalid Username/Password");
    }

    @Test(priority = 3)
    public void invalidLogin2(){

        driver.get("https://www.spicejet.com/");

        loginPage.tologinbtn.click();

        loginPage.emailbtn.click();

        loginPage.emailfield.sendKeys("hiroshimanagasaki@gmail.com");

        loginPage.passfield.sendKeys("spicejet@123");

        loginPage.loginbtn.click();

        Assert.assertEquals(loginPage.alertmsg.getText(), "Invalid Username/Password");
    }

    @Test(priority = 1)
    public void invalidLogin3(){

        driver.get("https://www.spicejet.com/");

        loginPage.tologinbtn.click();

        loginPage.emailbtn.click();

        loginPage.emailfield.sendKeys("spicejet@gmail.com");

        loginPage.passfield.sendKeys("spicejet@123");

        loginPage.loginbtn.click();

        Assert.assertEquals(loginPage.alertmsg.getText(), "Invalid Username/Password");
    }
}
