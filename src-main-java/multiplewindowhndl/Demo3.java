package multiplewindowhndl;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver1\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("http://prafpawar11.github.io/multiplewindows.html");
driver.findElement(By.name("fname")).sendKeys("selenium");
Thread.sleep(3000);
String parent=driver.getWindowHandle();
driver.findElement(By.partialLinkText("book")).click();
Set<String> allwindow=driver.getWindowHandles();
String fbid;
for(String a:allwindow)
{
	if(!a.equals(parent))
	{
		driver.switchTo().window(a);
		fbid=driver.getWindowHandle();
	}
	System.out.println(driver.getTitle());
	driver.findElement(By.name("firstname")).sendKeys("java");
	driver.findElement(By.name("lastname")).sendKeys("java");
	Thread.sleep(3000);
	driver.switchTo().window(parent);
	driver.findElement(By.name("address")).sendKeys("pune");
	
	
	driver.close();
	
	}
}
	}


