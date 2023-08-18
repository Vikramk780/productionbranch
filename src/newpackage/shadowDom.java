package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowDom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\CodStudio\\JavaLatestCodes\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("smart-menu:nth-child(1) > div:nth-child(1) > div:nth-child(3) > smart-menu-items-group:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)")).click();

	}

}
