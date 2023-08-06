package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 { 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://ui.cogmento.com/");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prafulp1010@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pr@ful0812");
driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//a[@class='item'][3]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[text()='Create']")).click();
driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Amit");
driver.findElement(By.xpath("//input[@autocomplete='new_password'][2]")).sendKeys("Patil");
	}

}
