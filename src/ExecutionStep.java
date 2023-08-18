
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionStep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\Desktop\\BestResume\\chromedriver.exe");
		Thread.sleep(3000);

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		
		
		WebElement ele =driver.findElement(By.xpath("iframe[title=\"W3Schools Free Online Web Tutorials\"]"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//a[@id='navbtn_menu']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
