package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\firstproject\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://prafpawar11.github.io/basicdemo.html");
WebElement  wb=driver.findElement(By.id("femail"));
boolean a=wb.isDisplayed();
System.out.println(a);
boolean b=wb.isEnabled();
System.out.println(b);
boolean c=wb.isSelected();
System.out.println(c);
wb.click();
boolean d=wb.isSelected();
System.out.println(d);
driver.findElement(By.id("male")).click();
boolean e=wb.isSelected();
System.out.println();
	}

}
