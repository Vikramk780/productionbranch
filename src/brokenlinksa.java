import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinksa {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\CodStudio\\JavaLatestCodes\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(4000);
		
	List<WebElement> alllinks =	driver.findElements(By.xpath("//a"));
	
	for(WebElement eachlink:alllinks) {
		
		String link=eachlink.getAttribute("href");
		
	sendlinkforcheck(link);
	}
	

	}

	private static void sendlinkforcheck(String link) throws IOException {
		// TODO Auto-generated method stub
		
		URL url = new URL(link);
		
		HttpsURLConnection  urlconnection=	(HttpsURLConnection) url.openConnection();
		urlconnection.connect();
		urlconnection.setConnectTimeout(4000);
		
		String reponsemsg=urlconnection.getResponseMessage();
		int responsecode=urlconnection.getResponseCode();
		
		if(responsecode>=400) {
			
			System.out.println("The link -"+link+ "is broken becasue -"+reponsemsg);

			}else {
				
				System.out.println("The link -"+link+ "is good because its repsonse is -"+reponsemsg);
			}

}}
