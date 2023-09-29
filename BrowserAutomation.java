import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class BrowserAutomation {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver.exe"); //location of chromedriver as I saved
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(500);
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(500);
		
		driver.navigate().to("https://amazon.in/");
		Thread.sleep(500);
		
		driver.navigate().to("https://x.com/");
		Thread.sleep(500);
		
		driver.navigate().to("https://instagram.com/");
		Thread.sleep(500);
		
		driver.close();
	}

}