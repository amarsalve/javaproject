package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\.rsrc\\0\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://prafpawar11.github.io/statictable.html");
List<WebElement> ls=driver.findElements(By.xpath("//td"));
int a=ls.size();
for(int i=0;i<a;i++)
{
	String b=ls.get(i).getText();

	if(b.contains("priya"))
	{
		System.out.println("test case is pass");
}
	}

}
}

