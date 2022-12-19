package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
WebElement wb=driver.findElement(By.id("email"));
boolean a=driver.findElement(By.id("fname")).isDisplayed();
System.out.println(a);
boolean b=driver.findElement(By.id("fname")).isEnabled();
System.out.println(b);
String c=wb.getAttribute("value");
System.out.println(c);
driver.findElement(By.id("fname")).sendKeys("Selenium");
Thread.sleep(4000);
wb.clear();
Thread.sleep(5000);
driver.close();
	}
}