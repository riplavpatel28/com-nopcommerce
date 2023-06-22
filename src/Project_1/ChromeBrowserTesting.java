package Project_1;
/** Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {

        String baseURL = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        //Launch Chrome browser

        WebDriver driver = new ChromeDriver();
        //open the URL in to browser
        driver.get(baseURL);
        //Maximise Browser
        driver.manage().window().maximize();
        //Give driver to Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title =driver.getTitle();
        System.out.println("Page Title is:" +title);
        //Get the current URL
        System.out.println("Current URL:" +driver.getCurrentUrl());
        //get the page source
        System.out.println("Page source:" +driver.getPageSource());
        // Get the email id
        WebElement emailField=driver.findElement(By.id("Email"));
        emailField.sendKeys("riplav@yahoo.com");
        //Get the Password
        driver.findElement(By.name("Password")).sendKeys("Riplav123");
        //Close the Browser
        driver.close();


    }
}