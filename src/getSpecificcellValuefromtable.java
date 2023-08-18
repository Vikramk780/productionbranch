import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSpecificcellValuefromtable {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		boolean flag =false;
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\Desktop\\BestResume\\chromedriver.exe");
		

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		List<WebElement> noorows =driver.findElements(By.cssSelector("table#customers>tbody>tr"));
		
		List<WebElement> noocols =driver.findElements(By.cssSelector("table#customers>tbody>tr>th"));
		
		
		int rowsize=noorows.size();
		int colsize=noocols.size();
		System.out.println(rowsize);
		System.out.println(colsize);
		
		for(int i=1; i<=colsize; i++) {
			
			for(int j=2; j<=rowsize; j++) {
				
				WebElement check =driver.findElement(By.cssSelector("table#customers>tbody>tr:nth-child("+j+")>td:nth-child("+i+")")); 
				
				String checknamecolandrow=check.getText();
				
				if(checknamecolandrow.equals("Roland Mendela")) {
					
					flag=true;
					System.out.println("The rows are==>"+i+"and the column is ==>" +j);
				}
				
				
			}
		}
		
		if(flag==true) {
			System.out.println("Hey the name you entered is present");
		}else {
			System.out.println("Hey the name you entered is not present");
		}
		
		driver.quit();
		
	}
	



}
