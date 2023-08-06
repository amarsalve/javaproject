package ListWebElement;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
List<WebElement> ls=driver.findElements(By.tagName("a"));
int a=ls.size();
System.out.println(a);
for(int i=0;i<ls.size();i++)
{
	System.out.println(ls.get(i).getText());
}

	}

}
