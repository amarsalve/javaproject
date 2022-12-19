package baseLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
Thread.sleep(4000);
WebElement wb=driver.findElement(By.name("login"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();",wb);
Thread.sleep(4000);
driver.close();

	}

}
