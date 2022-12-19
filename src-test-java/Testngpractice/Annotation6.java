package Testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseLayer.BaseClass;

public class Annotation6 {
	WebDriver driver;
@BeforeClass
public void setaUp()
{
	BaseClass.inilizataion();
}
@Test(priority=1)
public void loginfunctionality() throws InterruptedException
{
	Thread.sleep(4000);
driver.findElement(By.name("email")).sendKeys("prafulp1010@gmail.com");
driver.findElement(By.name("password")).sendKeys("Pr@ful812");
Thread.sleep(4000);
driver.findElement(By.xpath("//div[text()='Login']")).click();
}
@Test(priority=2)
public void validatehHomePageLogo()
{
	boolean a=driver.findElement(By.xpath("//div[@class='ui navbar fixed main menu']/div[1]")).isDisplayed();
	Assert.assertEquals(a, true);
}@Test(priority=3)
public void validatecontactpage() throws InterruptedException
{
	driver.findElement(By.xpath("//a[@href='/contacts']")).click();
	Thread.sleep(5000);
	String url=driver.getCurrentUrl();
	boolean a=url.contains("contacts");
	Assert.assertEquals(a, true);
}
@AfterClass
public void tearDown() throws InterruptedException
{
	Thread.sleep(5000);
	
}
	

}
