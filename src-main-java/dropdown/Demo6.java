package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
WebElement wb=driver.findElement(By.name("country"));
Select sel=new Select(wb);
sel.selectByVisibleText("INDIA");
String a=sel.getFirstSelectedOption().getText();
if(a.equals("INDIA"))
{
	System.out.println("test case is pass");
}
else {
	System.out.println("test case is fail");
}
List<WebElement> ls=sel.getOptions();
System.out.println(ls.size());
for(WebElement xyz:ls)
{
	System.out.println(xyz.getText());
}
	}
}
	
	


