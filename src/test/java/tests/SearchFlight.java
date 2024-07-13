package tests;

import base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchFlight extends BaseClass {

    @Test
    public void toSearchFlight1(){

        searchFlightPage.onewaybtn.click();

        searchFlightPage.fromfield.sendKeys("Chennai");

        searchFlightPage.tofield.clear();

        searchFlightPage.tofield.sendKeys("Delhi");

        searchFlightPage.deperaturedate.click();

        a.click(searchFlightPage.searchbtn).perform();

        Assert.assertEquals(searchFlightPage.verifyele.getText(), "Flight Details");
    }

    @Test
    public void toSearchFlight2(){

        driver.get("https://www.spicejet.com/");

        searchFlightPage.roundwaybtn.click();

        searchFlightPage.fromfield.sendKeys("Chennai");

        searchFlightPage.tofield.clear();

        searchFlightPage.tofield.sendKeys("Delhi");

        searchFlightPage.returndatebtn.click();

        searchFlightPage.returndatebtn.click();

        searchFlightPage.returndate.click();

        a.click(searchFlightPage.searchbtn).perform();

        Assert.assertEquals(searchFlightPage.verifyele.getText(), "Flight Details");
    }
}
