import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrmaesControll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\CodStudio\\JavaLatestCodes\\chromedriver.exe");
		driver = new ChromeDriver();
		
		////
		driver.get("https://dashboard.paytm.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//iframe[@title='login']"));
		driver.switchTo().frame(ele);
		
		
		driver.findElement(By.xpath("//input[@class='  x-input-text ']")).sendKeys("hello");
		
		
		

;
		
		driver.findElement(By.xpath("//div[@class=\"cKPVd2kKcfsd14K4cbBPc\"]")).click();
		
		TakesScreenshot sc = (TakesScreenshot) driver;
		
		File file =sc.getScreenshotAs(OutputType.FILE);
		
		File newFile = new File("C:\\CodStudio\\JavaLatestCodes\\tssed.png");
		FileUtils.copyFile(file, newFile);
		
		String parentid=driver.getWindowHandle();
		
		System.out.println(parentid);
		driver.findElement(By.xpath("//a[contains(.,\"privacy policy\")]")).click();
		
		Set<String> all=driver.getWindowHandles();
		
		for(String singleid:all){
			
			System.out.println(singleid);
			driver.switchTo().window(singleid);
			System.out.println(driver.getTitle());
		}
		driver.quit();

		

	}

}
