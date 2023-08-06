package ListWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
WebElement wb=driver.findElement(By.className("gLFyf"));
System.out.println(wb.isDisplayed());
System.out.println(wb.isEnabled());
System.out.println(wb.getAttribute("value"));
wb.click();
	}

}
