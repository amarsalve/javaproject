package screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\firstproject\\\\driver1\\\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(5000);

String a=driver.findElement(By.xpath("(//input[contains(@class,'--active')])[5]")).getText();
System.out.println(a);
TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\firstproject\\Screenshot\\pfullshot.png");
FileUtils.copyFile(src, dest);
	}

}
