package Testngpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations2 {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{

System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().window().maximize();
	}
@Test(priority=1)
public void googleTitle()
{
	driver.get("https://www.google.com");
	System.out.println(driver.getCurrentUrl());
}
@Test(priority=2)
public void facebookTitle()
{
	driver.get("https://www.facebook.com");
	System.out.println(driver.getCurrentUrl());
}
@AfterMethod
public void tearDown() throws InterruptedException
{
	Thread.sleep(4000);
	driver.close();
	
}
	
}
	
