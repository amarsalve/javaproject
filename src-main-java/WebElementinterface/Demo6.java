package WebElementinterface;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://prafpawar11.github.io/checkbox.html");
List<WebElement> ls=(List<WebElement>) driver.findElement(By.xpath("//input[@type='checkbox']"));
for(WebElement abc:ls)
{
	abc.click();
}
	}

	}


