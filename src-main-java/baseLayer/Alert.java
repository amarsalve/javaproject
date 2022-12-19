package baseLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com");
 Thread.sleep(5000);
 
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("alert('user in on login page');");
String a=driver.switchTo().alert().getText();
System.out.println(a);
Thread.sleep(5000);
driver.switchTo().alert().accept();


	}

}
