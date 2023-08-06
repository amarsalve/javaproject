package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;



public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver1\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/reg");
	WebElement wb=driver.findElement(By.id("month"));
	Select sel=new Select(wb);
	List<WebElement> ls=sel.getOptions();
	int a=ls.size();
	System.out.println(a);
	for(int i=0;i<a;i++)
	{
		String b=ls.get(i).getText();
		if(b.equals("jun"))
		{
			System.out.println("test case is pass");
		}
	}
		
	}

}
