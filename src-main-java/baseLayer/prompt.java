package baseLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prompt{
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement wb=driver.findElement(By.name("q"));
		wb.sendKeys("amar salve");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("prompt('user is on login page');");
		driver.switchTo().alert().sendKeys("Selenium");

	

		Thread.sleep(5000);
	
	

	}

}
