package browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {


    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        // Lanch the URL
        driver.get(baseUrl);
        // Maximise Window
        driver.manage().window().maximize();
        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is : " + title);

        // Get current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // Get page Source
        System.out.println("Page Source: " + driver.getPageSource());

        // navigate to login page by clicking on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        //type email to email field
        emailField.sendKeys("test123@gmail.com");

        // find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("test123");

        //close the browser
        driver.quit();

    }

}


