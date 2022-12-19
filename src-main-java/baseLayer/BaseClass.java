package baseLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//launch facebook site


public class BaseClass {
	public static WebDriver driver=null;
	public static void initELe() {
		// chrome driver path set
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		// upcasting concept used
		driver = new ChromeDriver();
		// site launched
		driver.get("https://www.facebook.com/");
		
		

	}
	public static void inilizataion() {
		// TODO Auto-generated method stub
		
	}
}
