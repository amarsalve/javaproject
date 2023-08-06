package screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver1\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();

driver.get("http://www.redbus.in");
driver.findElement(By.id("onward_cal")).click();
while(true)
{
	String a=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
	Thread.sleep(2000);
	if(a.equals("jan2023"))
	{
		break;
	}
	else
	{
		driver.findElement(By.xpath("//td[@class='next']")).click();
	}
}
driver.findElement(By.xpath("//td[text()='7']")).click();
String a=driver.findElement(By.id("onward_cal")).getAttribute("data-caleng");
System.out.println(a);
	}

}
