package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe" );
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("pushpa the rise");
driver.findElement(By.xpath("//input[@name='q'][2]")).click();
	}

}