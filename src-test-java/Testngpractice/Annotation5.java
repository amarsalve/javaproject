package Testngpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotation5 {
WebDriver driver;
@BeforeClass
public void setUp()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
	@Test(priority=1)
	public void googleTitle() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.get("https://www.orangehrm.com");
		System.out.println(driver.getCurrentUrl());
	}
	@Test(priority=2)
	public void facebooktitle() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.get("https://www.twitter.com");
		System.out.println(driver.getCurrentUrl());
	}
	@AfterClass
	public void tearDown() throws InterruptedException
	{
	Thread.sleep(4000);
	driver.close();
}
}
