package screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver1\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
WebElement wb=driver.findElement(By.id("pass"));
wb.sendKeys("amar1234");
File src=wb.getScreenshotAs(OutputType.FILE);
File dist=new File("C:\\Users\\Admin\\eclipse-workspace\\firstproject\\Screenshot\\aFullshot.png");
FileUtils.copyFile(src, dist);
	}

}
