	import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
	

public class WebDriverWaith {



	    public static void main(String[] args) {
	    	System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Create an instance of WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Launch the website
	        driver.get("https://www.example.com");

	        // Create an instance of WebDriverWait with a timeout of 10 seconds
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();
	        
	        Wait<WebDriver> wai = new FluentWait<WebDriver> (driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
	        
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).click();

	        // Explicitly wait until the element with ID "myElement" is visible
	        WebElement myElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myElement")));

	        // Perform actions on the element
	        myElement.click();

	        // Close the browser
	        driver.quit();
	    }



}
