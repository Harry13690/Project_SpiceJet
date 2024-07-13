package utilities;

import base.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReporter extends BaseClass {

    ExtentSparkReporter extentSparkReporter;
    ExtentReports extentReports;
    ExtentTest extentTest;

    public void startReport(){
        extentReports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter("reports/index.html");
        extentReports.attachReporter(extentSparkReporter);
        extentSparkReporter.config().setDocumentTitle("Regression Test");
        extentSparkReporter.config().getReporter();
    }

    public void test(){
        extentTest = extentReports.createTest("Verify the testcases");
        extentTest.log(Status.PASS,"TestCase is Pass");
    }

    public void afterMethod(){
        String path = BaseClass.takeScreenshot("test");
        extentTest.addScreenCaptureFromPath(path);
        extentTest.fail("TestCase is Fail");
    }

    public void afterTest(){
        extentReports.flush();
    }
}
