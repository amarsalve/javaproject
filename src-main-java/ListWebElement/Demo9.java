package ListWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver1\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.redbus.in/");
driver.findElement(By.id("onward_cal")).click();
while(true)
{
	String b=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	System.out.println(b);
	if(b.equals("May 2023"))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("//td[@class='next']")).click();
	}
}
{
	
}
	}

}
