package commons;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Extent_Report {

    public static void main(String[] args) {
        ExtentReports reports=new ExtentReports("ExtentreportResult.html");
        ExtentTest test=reports.startTest("Extent_Report");
        System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        if(driver.getTitle().equals("Google"))
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
        driver.close();

    }
}