package tests;

import base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightDetails extends BaseClass {

    @Test
    public void checkIn(){

        flightDetailsPage.checkinbtn.click();

        flightDetailsPage.ticknofield.sendKeys("45755746");

        flightDetailsPage.emailfield.sendKeys("dummybaba@gmail.com");

        a.click(flightDetailsPage.searchbkbtn).perform();

        Assert.assertTrue(flightDetailsPage.alertele.isDisplayed());
    }

    @Test(priority = 1)
    public void flightStatus(){

        flightDetailsPage.flightstsbtn.click();

        flightDetailsPage.originfield.sendKeys("Chennai");

        flightDetailsPage.destiniorigin.sendKeys("Delhi");

        flightDetailsPage.flightnofield.sendKeys("43546");

        a.click(flightDetailsPage.searchflightbtn).perform();

        Assert.assertEquals(flightDetailsPage.alertele.getText(), "Sorry, there are no flights available");
    }

    @Test
    public void manageBooking(){

        flightDetailsPage.managebkbtn.click();

        flightDetailsPage.ticknofield.sendKeys("45755746");

        flightDetailsPage.emailfield.sendKeys("dummybaba@gmail.com");

        a.click(flightDetailsPage.searchbkbtn).perform();

        Assert.assertTrue(flightDetailsPage.alertnotify.isDisplayed());
    }
}
