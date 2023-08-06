package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://prafpawar11.github.io/statictable.html");
List<WebElement> ls=driver.findElements(By.tagName("th"));
int a=ls.size();
System.out.println(a);
for(WebElement abc:ls)
{
	System.out.println(abc.getText());
}
	}

}
