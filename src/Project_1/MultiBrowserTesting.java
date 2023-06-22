package Project_1;
/**1. Setup Chrome browser
 2. Open URL
 3. Print the title of the page
 4. Print the current url
 5. Print the page source
 6. Enter the email to email field
 7. Enter the password to password field
 8. Close the browser
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    static String browser = "Firefox";
    static String baseURL = "https://demo.nopcommerce.com/login?returnUrl=%2";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
    } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Get Title of the page
        String title =driver.getTitle();
        System.out.println("Page title is" +title);
        //Get the Current Url
        String currentUrlUrl = driver.getCurrentUrl();
        System.out.println("CurrentURL"+currentUrlUrl);
        //Print the page source
        System.out.println("page source" +driver.getPageSource());
        // Get Email id
        WebElement emailField =driver.findElement(By.id("Email"));
        emailField.sendKeys("Prime123@hotmail.com");
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("abc123");
        //Close the browser
        driver.close();

    }


}
