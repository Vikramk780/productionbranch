import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\Desktop\\BestResume\\chromedriver.exe");
		Thread.sleep(3000);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Software Testing");
		Thread.sleep(3000);
		List<WebElement> suggetions =driver.findElements(By.xpath("//div[@id='Alh6id']//li"));
		System.out.println(suggetions.size());
		
		for( WebElement we:suggetions) {
			String nameofSuggetions = we.getText();
			System.out.println(nameofSuggetions);
			
			
		}
	}

}
