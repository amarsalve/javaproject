package ListWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("https://prafpawar11.github.io/statictable.html");

List<WebElement> ls =driver.findElements(By.xpath("//tr"));
int a=ls.size();
System.out.println(a);for(WebElement abc:ls)
{
	System.out.println(abc.getText());
}
	}

}
