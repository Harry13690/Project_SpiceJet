package tests;

import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectFlight extends BaseClass {

    @Test
    public void selectFlight(){

        searchFlightPage.onewaybtn.click();

        searchFlightPage.fromfield.sendKeys("Chennai");

        searchFlightPage.tofield.clear();

        searchFlightPage.tofield.sendKeys("Delhi");

        searchFlightPage.deperaturedate.click();

        a.click(searchFlightPage.searchbtn).perform();

        a.click(searchFlightPage.continuebtn).perform();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.spicejet.com/booking");
    }
}
