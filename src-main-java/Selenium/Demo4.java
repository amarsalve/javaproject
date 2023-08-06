package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
String a=driver.getTitle();
System.out.println(a);
if(a.contains("Facebook"))
{
	System.out.println("Test case is pass");
}
else
{
	System.out.println("Test case is fail");
	
}
	}

}
