package firstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/reg");
WebElement wb=driver.findElement(By.id("month"));
Select sel= new Select(wb);
List<WebElement> ls=sel.getOptions();
for(WebElement abc:ls)
{
	String a=abc.getText();
	System.out.println(a);
}

	}
}
