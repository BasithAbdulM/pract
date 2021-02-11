package commons;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Base_Class {
    protected static WebDriver driver;

    public static void pretest() throws InterruptedException, IOException {
        ExtentReports reports;
        reports=new ExtentReports("EXR.html");
        ExtentTest test=reports.startTest("pretest");
        System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://www.amazon.in/");
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
       File sourcefile= takesScreenshot.getScreenshotAs(OutputType.FILE);
       File file=new File("D://sample.png");
        FileHandler.copy(sourcefile,file);
        if(driver.getTitle().equals("amazon.in"))
        {
            System.out.println("Test Pass");
            test.log(LogStatus.PASS,"Navigated to URL");
        }
        else
        {
            System.out.println("Test Fail");
            test.log(LogStatus.FAIL,"Test Failed");

        }
        reports.endTest(test);
        reports.flush();


        Thread.sleep(3000);
    }
    public  static void protest() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
}
