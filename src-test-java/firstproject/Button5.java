package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button5 {
@Test
public static void button()	{	// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensourcedemo.orangehrmlive.com/");
		WebElement wb=driver.findElement(By.xpath("//input[@name='Submit']"));
		
	}
}
