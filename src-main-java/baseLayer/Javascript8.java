package baseLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript8 {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.facebook.com");
WebElement wb=driver.findElement(By.id("email"));	
	Javascript8.enterData("selenium testing",wb);
	
	
	}


	public static void enterData(String string, WebElement wb) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value()='amar';",wb);
	
	

	}
}
