package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
System.out.println(driver.getCurrentUrl());
driver.switchTo().newWindow(WindowType.TAB);
driver.get("https:www.facebook.com");
Thread.sleep(5000);
driver.quit();
	}

}
