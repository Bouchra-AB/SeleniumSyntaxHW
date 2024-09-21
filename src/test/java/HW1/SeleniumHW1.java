package HW1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

package HW1;

public class SeleniumHW1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        // Navigate to the Syntax Projects website
        driver.get("https://www.syntaxprojects.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Get and print the current URL
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        // Step 4: Get and print the page title
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        driver.close();
    }

}
