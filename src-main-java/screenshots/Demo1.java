package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver1\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
WebElement wb=driver.findElement(By.id("email"));
wb.sendKeys("selenium testing");

//it will capture the screenshot
TakesScreenshot ts=((TakesScreenshot)driver);
File src=ts.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Admin\\eclipse-workspace\\firstproject\\Screenshot\\pfullPage.png");
FileUtils.copyFile(src, dest);
System.out.println("Screeshot captured");
		
	}

}
