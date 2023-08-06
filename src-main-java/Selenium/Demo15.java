package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\firstproject\\\\driver\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://praf002.github.io/");
driver.findElement(By.id("name")).sendKeys("Selenium Tutorial");
	}

}
