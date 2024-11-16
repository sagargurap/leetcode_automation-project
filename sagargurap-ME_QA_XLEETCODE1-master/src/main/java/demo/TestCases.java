package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import java.util.logging.Level;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");

        WebDriverManager.chromedriver().timeout(30).setup();
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        // Set log level and type
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);

        // Set path for log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "chromedriver.log");

        driver = new ChromeDriver(options);

        // Set browser to maximize and wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.leetcode.com/");
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.contains("leetcode")){
            System.out.println("The URL of the Leetcode homepage contains 'leetcode'");
        }
        else{
            System.out.println("The URL of the Leetcode homepage does not contains 'leetcode'");
        }

        System.out.println("end Test case: testCase01");
    }
    
    public  void testCase02() throws InterruptedException{
        System.out.println("Start Test case: testCase02");
        int count = 0;
        driver.get("https://www.leetcode.com/");
        WebElement quesLink = driver.findElement(By.xpath("//a/p[text() ='View Questions ']"));
        quesLink.click();
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.contains("problemset")){
            System.out.println("The URL of the Leetcode questionspage contains 'problemset'");
        }
        else{
            System.out.println("The URL of the Leetcode questionspage does not contains 'problemset'");
        }

        WebElement quesdetails = driver.findElement(By.xpath("(//div[@class='truncate']/a)[2]"));
        String questiontxt = quesdetails.getText();
        System.out.println(questiontxt);
        quesdetails.click();
        Thread.sleep(5000);
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(10000);
        if(title.contains("Two Sum")){
            System.out.println("Title for Two sum verified");
            count++;
        }
        else{
            System.out.println("Title for Two sum not verified");
        }
        
        driver.navigate().back();
        Thread.sleep(5000);

        WebElement quesdetails2 = driver.findElement(By.xpath("(//div[@class='truncate']/a)[3]"));
        String questiontxt2 = quesdetails2.getText();
        System.out.println(questiontxt2);
        quesdetails2.click();
        Thread.sleep(5000);
        String title2 = driver.getTitle();
        System.out.println(title2);
        Thread.sleep(10000);
        if(title2.contains("Add Two Numbers")){
            System.out.println("Title for Add Two Numbers verified");
            count++;
        }
        else{
            System.out.println("Title for Add Two Numbers not verified");
        }

        driver.navigate().back();
        Thread.sleep(5000);

        WebElement quesdetails3 = driver.findElement(By.xpath("(//div[@class='truncate']/a)[4]"));
        String questiontxt3 = quesdetails3.getText();
        System.out.println(questiontxt3);
        quesdetails3.click();
        Thread.sleep(5000);
        String title3 = driver.getTitle();
        System.out.println(title3);
        Thread.sleep(10000);
        if(title3.contains("Longest Substring")){
            System.out.println("Title for Longest Substring verified");
            count++;
        }
        else{
            System.out.println("Title for Longest Substring not verified");
        }

        driver.navigate().back();

        WebElement quesdetails4 = driver.findElement(By.xpath("(//div[@class='truncate']/a)[5]"));
        String questiontxt4 = quesdetails4.getText();
        System.out.println(questiontxt4);
        quesdetails4.click();
        Thread.sleep(5000);
        String title4 = driver.getTitle();
        System.out.println(title4);
        Thread.sleep(10000);
        if(title4.contains("Median of Two Sorted Arrays")){
            System.out.println("Title for Median of Two Sorted Arrays verified");
            count++;
        }
        else{
            System.out.println("Title for Median of Two Sorted Arrays not verified");
        }

        driver.navigate().back();

        WebElement quesdetails5 = driver.findElement(By.xpath("(//div[@class='truncate']/a)[6]"));
        String questiontxt5 = quesdetails5.getText();
        System.out.println(questiontxt5);
        quesdetails5.click();
        Thread.sleep(5000);
        String title5 = driver.getTitle();
        System.out.println(title5);
        Thread.sleep(10000);
        if(title5.contains("Longest Palindromic Substring")){
            System.out.println("Title for Longest Palindromic Substring verified");
            count++;

        }
        else{
            System.out.println("Title for Longest Palindromic Substring not verified");
        }

        if(count==5){
            System.out.println("The correct details of the problems are obtained and verified.");
        }
        else {
            System.out.println("The correct details of the problems are not obtained and verified.");

        }

        System.out.println("end Test case: testCase02");
    }
    
    public  void testCase03() throws InterruptedException{
        System.out.println("Start Test case: testCase03");
        driver.get("https://www.leetcode.com/");
        WebElement quesLink = driver.findElement(By.xpath("//a/p[text() ='View Questions ']"));
        quesLink.click();
 
        WebElement twosumquestion = driver.findElement(By.xpath("//a[text()='Two Sum']"));
        twosumquestion.click();
        Thread.sleep(5000);
        String currentUrl = driver.getCurrentUrl();
        if(currentUrl.contains("two-sum")){
            System.out.println("The URL of the problem contains 'two-sum'");
        }
        else{
            System.out.println("The URL of the problem does not contains 'two-sum'");
        }

        System.out.println("end Test case: testCase03");
    }
    public  void testCase04() throws InterruptedException{
        System.out.println("Start Test case: testCase04");
        driver.get("https://www.leetcode.com/");
        WebElement quesLink = driver.findElement(By.xpath("//a/p[text() ='View Questions ']"));
        quesLink.click();
 
        WebElement twosumquestion = driver.findElement(By.xpath("//a[text()='Two Sum']"));
        twosumquestion.click();
        Thread.sleep(5000);
        WebElement submissionTab = driver.findElement(By.xpath("//div[@id ='submissions_tab']"));
        submissionTab.click();
        Thread.sleep(5000);
        
        WebElement msgArea = driver.findElement(By.xpath("//div[@class='flex w-full flex-col items-center gap-6']"));
        String msgText = msgArea.getText();
        System.out.println(msgText);
        if(msgText.contains("Register or Sign In")){
        System.out.println("The message 'Register or Sign In' is displayed when you click on the submissions tab.");
        }
        else{
            System.out.println("The message 'Register or Sign In' is not displayed when you click on the submissions tab.");
        }
        System.out.println("end Test case: testCase04");
    }
}
