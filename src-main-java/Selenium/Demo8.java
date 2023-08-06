package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https:www.amazon.com");
String a=driver.getTitle();
System.out.println(a);
if(a.contains("Amazon"))
{
	System.out.println("Title test case is pass");
}
else
{
	System.out.println("Title test case is fail");
}
driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
String b=driver.getCurrentUrl();
System.out.println(b);
if(b.contains("hrm"))
{
	System.out.println("Url test caswe is pass");
}
else
{
	System.out.println("Url test case is fail");
}
	
}
}