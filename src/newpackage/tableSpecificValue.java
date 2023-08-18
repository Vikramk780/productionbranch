package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableSpecificValue {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deva\\Desktop\\BestResume\\chromedriver.exe");

		driver.get("https://the-internet.herokuapp.com/tables");

		String s1 = "$50.00";

		System.out.println(checkstring(s1));

	}

	private static String checkstring(String s1) {
		// TODO Auto-generated method stub
		int row = driver.findElements(By.cssSelector("#table1>tbody>tr")).size();
		int col = driver.findElements(By.cssSelector("#table1>tbody>tr:first-child>td")).size();

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++) {

				WebElement ele = driver
						.findElement(By.cssSelector("#table1>tbody>tr:nth-child(" + i + ")>td:nth-child(" + j + ")"));

				String textt = ele.getText();

				

				if (textt.equals(s1)) {

					return "The String"+" " + s1+" is present";

				}
			}
		}
		return "The String"+" "  + s1+" is not present";

	}
}
