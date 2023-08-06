package multiplewindowhndl;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver1\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));		
		driver.get("http://prafpawar11.github.io/multiplewindows.html");
		driver.findElement(By.name("fname")).sendKeys("sanuja");
		driver.findElement(By.partialLinkText("HRM")).click();
		Set<String> allwindow=driver.getWindowHandles();
		Iterator<String> allwin=allwindow.iterator();
		String parentid=allwin.next();
		String hrmid=allwin.next();
		driver.switchTo().window(hrmid);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()=PIM]")).click();
		driver.findElement(By.xpath("//button[text()='add']")).click();
		driver.findElement(By.name("firstName")).sendKeys("selenium");
		driver.findElement(By.name("lastName")).sendKeys("testing");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\Admin\\eclipse-workspace\\firstproject\\Screenshot\\mshot.png");
FileUtils.copyFile(src, dist);	
driver.close();
driver.switchTo().window(parentid);
System.out.println(driver.getTitle());
		
	}

}
