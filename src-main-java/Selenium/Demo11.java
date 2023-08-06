package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//open a google application
		//capture title
		//navigate to fb url
		//navigate back
		//capture url
		//navigate forword
		//capture url
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String a=driver.getTitle();
		Thread.sleep(5000);
		System.out.println(a);
		driver.navigate().to("https://www.facebook.com");
		String b=driver.getTitle();
		Thread.sleep(5000);
		System.out.println(b);
		driver.navigate().back();
		String c=driver.getCurrentUrl();
		Thread.sleep(5000);
		System.out.println(c);
		driver.navigate().forward();
		String d=driver.getCurrentUrl();
		System.out.println(d);
		
		
		
	}

}
