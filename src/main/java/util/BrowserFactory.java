package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedrivernew.exe");
		driver = new ChromeDriver();
		driver.get("http://techfios.com/test/101/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		return driver;
	}
	
  public void tearDown() {
	  driver.close();
	  driver.quit();
  }
  
}
