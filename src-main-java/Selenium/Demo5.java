package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https:www.google.com");
String a=driver.getCurrentUrl();
System.out.println(a);
if(a.contains("google"))
{
	System.out.println("Test case is pass");
}
else
{
	System.out.println("test case is fail");
}

	}

}
