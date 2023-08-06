package multiplewindowhndl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
	
	}	
}
System.out.println(driver.getTitle());
driver.findElement(By.name("firstname")).sendKeys("amar");
driver.findElement(By.name("lastname")).sendKeys("salve");
Thread.sleep(3000);
driver.switchTo().window(parent);
driver.findElement(By.name("adress")).sendKeys("pune");
	}

	}


