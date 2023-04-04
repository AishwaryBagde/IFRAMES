package demo;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.hc.core5.http.nio.entity.NoopEntityConsumer;
import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///

public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        
        // Launch Chrome :
        // Load URL :https://chercher.tech/practice/frames
        driver.get("https://chercher.tech/practice/frames");
        Thread.sleep(3000);

        // Print the no of iframes on the page
        int noOfIframesPresent = driver.findElementsByTagName("iframe").size();
        System.out.println("The No Of Main Iframes Present on the Page are : "+ noOfIframesPresent);
        
        // Locate the 1st IFrame Using Locator "ID":"frame1"
        WebElement frame1 = driver.findElementById("frame1");
        // Switch to frame 1 :driver.switchTo().frame():
        driver.switchTo().frame(frame1);
        Thread.sleep(1000);
        // Locate the 3rd IFrame Using Locator "ID":"frame3"
        WebElement frame3 = driver.findElementById("frame3");
        // Switch to frame 3 :driver.switchTo.frame():
        driver.switchTo().frame(frame3);
        Thread.sleep(1000);
        // Find the Element checkBox and click on it Using Locator "ID":"a" / click();
        driver.findElementById("a").click();
        Thread.sleep(1000);
 
     
    }


}
