package multiplewindowhndl;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://prafpawar11.github.io/multiplewindows.html");
driver.findElement(By.name("fname")).sendKeys("selenium");
String parent=driver.getWindowHandle();
System.out.println(parent);
driver.findElement(By.partialLinkText("Google")).click();
Set<String> allwindow=driver.getWindowHandles();
for(String abc:allwindow)
{
	if(!abc.equals(parent));
	{
		driver.switchTo().window(abc);
		System.out.println(driver.getTitle());
	}
}
	}

}
