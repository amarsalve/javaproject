package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseLayer.BaseClass;

public class TestJava {

	public static WebDriver driver = null;

	// launch facebook site
	// click on Usename text box
	// send text to Username text box

	// click on Password text box
	// send text to Password text box

	// click on Login button
	public static void main(String[] args) {
//		TestJava.initELe();
//		BaseClass.initELe();
		// chrome driver path set
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		// upcasting concept used
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// Username text box element find
		WebElement wb1 = driver.findElement(By.id("email"));
		// click method used
		wb1.click();
		// send the text to th Username text box by using send Keys
		wb1.sendKeys("kunalithape9@gmail.com");

		// Password text box element find
		WebElement wb2 = driver.findElement(By.id("pass"));
		// clickon Password textbox
		wb2.click();
		// sent text to Password text box by using SendKeys method
		wb2.sendKeys("12345678");

		// login button element find
		WebElement wb3 = driver.findElement(By.name("login"));
		// click on login button
		wb3.click();

	}

}
