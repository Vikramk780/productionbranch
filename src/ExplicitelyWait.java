import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitelyWait {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\CodStudio\\JavaLatestCodes\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
			
		driver.get("https://qavbox.github.io/demo/links/");
		
		
		By newbtn = By.xpath("//input[@name='NewTab']");
		By hammenu = By.xpath("//div[@class='soc-ico show-on-desktop in-top-bar-right in-menu-second-switch custom-bg disabled-border border-off hover-accent-bg hover-disabled-border hover-border-off first last']//a[1]");
		
		 Set<String> oldHandles = driver.getWindowHandles();
		 explicitelywaitt(newbtn).click();
		
		Set<String> newHandles = driver.getWindowHandles();
		
		 for (String handle : newHandles) {

		        if (!oldHandles.contains(handle)) {
		            driver.switchTo().window(handle);
		            fluentwaittelement(hammenu).click();
		            
		        }

		    }
		
		
		
	}
	
	static WebElement explicitelywaitt(By element ) {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	WebElement changewnewbtn =	wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	
	return changewnewbtn;
		
	}
	
	static WebElement fluentwaittelement(By element) {
		
		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		
		WebElement newelement=wait.until(ExpectedConditions.elementToBeClickable(element));  
		return newelement;
				
	}

}
