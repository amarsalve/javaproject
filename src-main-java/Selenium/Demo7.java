package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https:www.google.com");
String a=driver.getTitle();
System.out.println(a);
//navigate to facebook application
driver.navigate().to("https:www.facebook.com");
String b=driver.getCurrentUrl();
System.out.println(b);
	}

}
