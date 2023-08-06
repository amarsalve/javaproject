package Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.google.com");
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");
driver.findElement(By.xpath("//input[@name='q']")).click();
WebElement wb=driver.findElement(By. xpath("//h3[text()='Selenium'][2]"));
wb.clear();
wb.sendKeys("Selenium WebDriver");
	}

}
