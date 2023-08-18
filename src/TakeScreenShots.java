import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShots {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub

		
		
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\Desktop\\BestResume\\chromedriver.exe");
		

		driver.get("https://www.zoho.com/commerce/free-demo.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		methodtoTakeScreenShot();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_W);
		
		
		
		
	}
	
	
	static void methodtoTakeScreenShot() throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File screen =ts.getScreenshotAs(OutputType.FILE);
		File storage = new File("C:\\Users\\Deva\\Desktop\\BestResume\\Java\\FileUtils\\Screenshotst\\newiqmage.png");
		FileUtils.copyFile(screen, storage);
	}

}
