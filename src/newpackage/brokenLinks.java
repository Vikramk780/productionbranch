package newpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args)  throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\CodStudio\\JavaLatestCodes\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
		List<WebElement> ele=driver.findElements(By.xpath("//a"));
		
		for(WebElement link: ele) {
			
			String url=link.getAttribute("href");
			Thread.sleep(200);
			
			checkthisUrlIsbrockenOrnot(url);
		}
		
		

	}

	private static void checkthisUrlIsbrockenOrnot(String url)  throws IOException {
		// TODO Auto-generated method stub
		
		URL ur;
		
			ur = new URL(url);
		
		
		HttpsURLConnection connection =(HttpsURLConnection)ur.openConnection();
		
		connection.connect();
		connection.setConnectTimeout(5000);
		
		String msgfromconn=connection.getResponseMessage();
		int responsecode =connection.getResponseCode();
		
		if(responsecode>=400) {
			
			System.out.println("The link--"+url+"broken check please");
		}else {
			
			System.out.println("The link-->"+url+" is valid");
		}
		
	}

}
