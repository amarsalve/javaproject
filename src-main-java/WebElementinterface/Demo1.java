package WebElementinterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
boolean a=driver.findElement(By.id("email")).isDisplayed();
System.out.println(a);
boolean b=driver.findElement(By.id("email")).isEnabled();
System.out.println(b);
driver.findElement(By.id("email")).sendKeys("selenium testing");
String c=driver.findElement(By.id("email")).getAttribute("value");
System.out.println(c);
Thread.sleep(5000);
driver.findElement(By.id("email")).clear();
Thread.sleep(5000);
driver.close();
	}

}
