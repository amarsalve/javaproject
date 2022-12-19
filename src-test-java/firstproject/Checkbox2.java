package firstproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://prafpawar11.github.io/basicdemo.html");
for(int i=0;i<=3;i++)
{
	WebElement wb=driver.findElement(By.id("cheakbx"+i));
	System.out.println(wb.isDisplayed());
	System.out.println(wb.isEnabled());
	System.out.println(wb.isSelected());
wb.click();
System.out.println(wb.isSelected());
wb.click();
	
}	
}
	}



