package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/reg");
WebElement wb=driver.findElement(By.id("year"));
//we have to create object of Select class by passing webElement instance name
Thread.sleep(5000);
Select sel=new Select(wb);
sel.selectByIndex(3);
WebElement abc=sel.getFirstSelectedOption();
String a=abc.getText();
System.out.println(a);
	}

}
