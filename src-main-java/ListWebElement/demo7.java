package ListWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver1\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://prafpawar11.github.io/emptable.html");
List<WebElement> ls=driver.findElements(By.xpath("//tr/td[2]"));
for(WebElement abc:ls)
{
System.out.println(abc.getText());	
}
	}

}
