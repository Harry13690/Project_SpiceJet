package tests;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Booking extends BaseClass {

    @Test
    public void bookingFlight(){

        searchFlightPage.onewaybtn.click();

        searchFlightPage.fromfield.sendKeys("Chennai");

        searchFlightPage.tofield.clear();

        searchFlightPage.tofield.sendKeys("Delhi");

        searchFlightPage.deperaturedate.click();

        a.click(searchFlightPage.searchbtn).perform();

        a.click(searchFlightPage.continuebtn).perform();

        bookingPage.firstnamefield.sendKeys("firstname");

        bookingPage.lastnamefield.sendKeys("lastname");

        bookingPage.phnofield.sendKeys("9544574384");

        bookingPage.emailfield.sendKeys("username@gmail.com");

        bookingPage.passfirstnamefield.sendKeys("firstname");

        bookingPage.passlastnamefield.sendKeys("lastname");

        a.click(bookingPage.continuebtn1).perform();

        a.click(bookingPage.continuebtn2).perform();

        bookingPage.cardnofield.sendKeys("4379 3434 8436 7346");

        bookingPage.cardnamefield.sendKeys("Ambani A");

        bookingPage.expmonfield.sendKeys("12");

        bookingPage.expyrfield.sendKeys("29");

        bookingPage.cvvfield.sendKeys("765");

        bookingPage.continuebtn3.click();
    }
}
