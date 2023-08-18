import org.openqa.selenium.Point;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\Desktop\\BestResume\\chromedriver.exe");
		

		driver.get("https://www.google.com");
		Point p = new Point(100,200);
		
		driver.manage().window().setPosition(p);
		
		
	}

}
