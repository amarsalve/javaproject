package baseLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Usingbroser {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
Thread.sleep(5000);
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.location='https://www.facebook.com';");
Thread.sleep(5000);
WebElement uname=driver.findElement(By.name("email"));
uname.sendKeys("amar");
js.executeScript("argument[0].value='amar';",uname);

	
WebElement pass=driver.findElement(By.id("passContainer"));
pass.sendKeys("amar12345");
js.executeScript("argument[0].value='amar12345';",pass);
WebElement wb=driver.findElement(By.xpath("//input[@type='password']"));
Thread.sleep(5000);
js.executeScript("argument[0].click();",wb);


	}

}
