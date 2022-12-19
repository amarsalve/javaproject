package Testngpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test6 {
	WebDriver driver;
@Test(priority=-100)
public void setUp()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://opensourcedemo.orangehrmlive.com/web/index.php/auth/login");
}
@Test (priority=100)
public void loginFunctionality()
{
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("Admin123");
	driver.findElement(By.xpath("//input[@type='password']")).click();
}
	@Test(priority=200)
	public void validatePIMPageTitle()
	{
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		String a=driver.getCurrentUrl();
		if(a.contains("pim"))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("test case is fail");
		}
	



}
}
