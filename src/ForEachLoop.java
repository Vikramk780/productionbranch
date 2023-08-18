import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\Desktop\\BestResume\\chromedriver.exe");
		Thread.sleep(3000);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> ele=driver.findElements(By.xpath("//a"));
		System.out.println(ele.size());
		
		for(WebElement ele2:ele) {
			String urla =ele2.getAttribute("href");
			System.out.println(urla);
		}
		
		
		
		
		
	

	}

}
