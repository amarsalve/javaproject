package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https:www.facebook.com");
String a=driver.getCurrentUrl();
System.out.println(a);
driver.navigate().to("https:www.amazon.com");
String b=driver.getCurrentUrl();
System.out.println(b);
Thread.sleep(4000);
driver.navigate().back();
String c=driver.getTitle();
System.out.println(c);

	}

}
