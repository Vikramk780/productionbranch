import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\Desktop\\BestResume\\chromedriver.exe");
		

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement fromelemenet=driver.findElement(By.cssSelector("div#box1"));  
		
		WebElement toelement = driver.findElement(By.cssSelector("div#box106"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(fromelemenet, toelement).perform();
		
//		Action dragAndDrop=builder.clickAndHold(fromelemenet).release(toelement).build();
		
//		dragAndDrop.perform();
		
	}

}
