import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://qavbox.github.io/demo/links/");
		
		List<WebElement> links =driver.findElements(By.cssSelector("a"));
		
		for(WebElement ele:links) {
			
			String url =ele.getAttribute("href");
			
			Thread.sleep(200);
			
			verifyLink(url);
			
		}
		
		

	}

	 static void verifyLink(String url) throws IOException {
		// TODO Auto-generated method stub
		 
		 
			 
			try {
				HttpURLConnection	conn = (HttpURLConnection) new URL(url).openConnection();
				conn.setConnectTimeout(500);
				conn.connect();
				
				 String message =conn.getResponseMessage();
				 int statuscode =conn.getResponseCode();
				 
				 
				 if(statuscode>=400) {
					 System.out.println("the link-->"+ url + "badrequest "+ message );
				 }else {
					 System.out.println("the link-->"+ url + "working "+ message );
				 }
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		
		
		
	}

}
